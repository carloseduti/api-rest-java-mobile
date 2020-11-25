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

import com.barberia.apirest.model.Cliente;
import com.barberia.apirest.repository.ClienteRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente clienteById(@PathVariable(value = "id") long id){
		return clienteRepository.findById(id);
	}
	
	@PostMapping("/cliente")
	public Cliente salvarCliente(@RequestBody Cliente cliente) {	
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("/cliente") 
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/cliente")
	public void deletaCliente(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
}
