package com.barberia.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barberia.apirest.model.Corte;

public interface CorteRepository extends JpaRepository<Corte, Long> {
	
	Corte findById(long id);
	
	Corte deleteById(long id);
}
