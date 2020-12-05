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

import com.barberia.apirest.model.Pedido;
import com.barberia.apirest.repository.PedidoRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class PedidoResource {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("/pedidos")
	public List<Pedido> listaPedidos(){
		return pedidoRepository.findAll();
	}
	
	@GetMapping("/pedido/{id}")
	public Pedido pedidoById(@PathVariable(value = "id") long id){
		return pedidoRepository.findById(id);
	}
	
	@PostMapping("/pedido")
	public Pedido salvarPedido(@RequestBody Pedido pedido) {	
		return pedidoRepository.save(pedido);
	}
	
	@PutMapping("/pedido") 
	public Pedido atualizarPedido(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	@DeleteMapping("/pedido")
	public void deletaPedido(@RequestBody Pedido pedido) {
		pedidoRepository.delete(pedido);
	}
	
	@DeleteMapping("/pedido/{id}")
	public void deletePedidoById(@PathVariable(value = "id") long id){
		 pedidoRepository.deleteById(id);
	}
	
}
