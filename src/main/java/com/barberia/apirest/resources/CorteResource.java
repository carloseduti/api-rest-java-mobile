package com.barberia.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barberia.apirest.model.Corte;
import com.barberia.apirest.repository.CorteRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class CorteResource {
	
	@Autowired
	CorteRepository corteRepository;
	
	@GetMapping("/cortes")
	public List<Corte> listaCortes(){
		return corteRepository.findAll();
	}
	
	@GetMapping("/corte/{id}")
	public Corte corteById(@PathVariable(value = "id") long id){
		return corteRepository.findById(id);
	}
	
	@PostMapping("/corte")
	public Corte salvarCorte(@RequestBody Corte corte) {	
		return corteRepository.save(corte);
	}
	
	@PutMapping("/corte") 
	public Corte atualizarCorte(@RequestBody Corte corte) {
		return corteRepository.save(corte);
	}
	
	@DeleteMapping("/corte")
	public void deletaCorte(@RequestBody Corte corte) {
		corteRepository.delete(corte);
	}
	
	@DeleteMapping("/corte/{id}")
	public void deleteClienteById(@PathVariable(value = "id") long id){
		corteRepository.deleteById(id);
	}
	
}
