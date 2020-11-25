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

import com.barberia.apirest.model.Funcionario;
import com.barberia.apirest.repository.FuncionarioRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class FuncionarioResource {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@GetMapping("/funcionarios")
	public List<Funcionario> listaFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/funcionario/{id}")
	public Funcionario funcionarioById(@PathVariable(value = "id") long id){
		return funcionarioRepository.findById(id);
	}
	
	@PostMapping("/funcionario")
	public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario) {	
		return funcionarioRepository.save(funcionario);
	}
	
	@PutMapping("/funcionario") 
	public Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	@DeleteMapping("/funcionario")
	public void deletaFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}
	
}
