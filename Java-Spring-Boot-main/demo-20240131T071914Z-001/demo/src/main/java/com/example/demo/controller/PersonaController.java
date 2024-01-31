package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/list")
    public List<Persona> list(){
        return personaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Persona readOne(@PathVariable("id") long id){
        return personaRepository.getById(id);
    }

    @PostMapping() 
    public Persona insert(@RequestBody Persona p){
        return personaRepository.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        personaRepository.deleteById(id);

    }

    @PutMapping("/{id}")
    public Persona update(@PathVariable("id") Long id,  @RequestBody Persona p){
        p.setId(id);
        return personaRepository.save(p);
    }
    }
    
    
    
    


