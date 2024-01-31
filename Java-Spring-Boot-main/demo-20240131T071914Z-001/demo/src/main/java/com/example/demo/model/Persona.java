package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
public class Persona {

    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
    private String nome, cognome;
    private String eta;

    
    public Persona() {
    }

    public Persona(long id, String nome, String cognome, String eta) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public String getEta() {
        return eta;
    }
    public void setEta(String eta) {
        this.eta = eta;
    }
}
