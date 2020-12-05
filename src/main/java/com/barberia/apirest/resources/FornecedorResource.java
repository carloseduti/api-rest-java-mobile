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

import com.barberia.apirest.model.Fornecedor;
import com.barberia.apirest.repository.FornecedorRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class FornecedorResource {
	
	@Autowired
	FornecedorRepository fornecedorRepository;
	
	@GetMapping("/fornecedors")
	public List<Fornecedor> listaFornecedors(){
		return fornecedorRepository.findAll();
	}
	
	@GetMapping("/fornecedor/{id}")
	public Fornecedor fornecedorById(@PathVariable(value = "id") long id){
		return fornecedorRepository.findById(id);
	}
	
	@PostMapping("/fornecedor")
	public Fornecedor salvarFornecedor(@RequestBody Fornecedor fornecedor) {	
		return fornecedorRepository.save(fornecedor);
	}
	
	@PutMapping("/fornecedor") 
	public Fornecedor atualizarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	
	@DeleteMapping("/fornecedor")
	public void deletaFornecedor(@RequestBody Fornecedor fornecedor) {
		fornecedorRepository.delete(fornecedor);
	}
	
	@DeleteMapping("/fornecedor/{id}")
	public void deleteFornecedorById(@PathVariable(value = "id") long id){
		 fornecedorRepository.deleteById(id);
	}
	
}
