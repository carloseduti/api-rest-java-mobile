package com.barberia.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barberia.apirest.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	Pedido findById(long id);
	
	Pedido deleteById(long id);
}
