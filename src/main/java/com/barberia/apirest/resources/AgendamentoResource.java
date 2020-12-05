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

import com.barberia.apirest.model.Agendamento;
import com.barberia.apirest.repository.AgendamentoRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class AgendamentoResource {
	
	@Autowired
	AgendamentoRepository agendamentoRepository;
	
	@GetMapping("/agendamentos")
	public List<Agendamento> listaAgendamentos(){
		return agendamentoRepository.findAll();
	}
	
	@GetMapping("/agendamento/{id}")
	public Agendamento agendamentoById(@PathVariable(value = "id") long id){
		return agendamentoRepository.findById(id);
	}
	
	@PostMapping("/agendamento")
	public Agendamento salvarAgendamento(@RequestBody Agendamento agendamento) {	
		return agendamentoRepository.save(agendamento);
	}
	
	@PutMapping("/agendamento") 
	public Agendamento atualizarAgendamento(@RequestBody Agendamento agendamento) {
		return agendamentoRepository.save(agendamento);
	}
	
	@DeleteMapping("/agendamento")
	public void deletaAgendamento(@RequestBody Agendamento agendamento) {
		agendamentoRepository.delete(agendamento);
	}
	
	@DeleteMapping("/agendamento/{id}")
	public void deleteClienteById(@PathVariable(value = "id") long id){
		agendamentoRepository.deleteById(id);
	}
	
}
