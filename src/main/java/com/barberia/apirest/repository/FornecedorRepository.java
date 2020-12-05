package com.barberia.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barberia.apirest.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	
	Fornecedor findById(long id);
	
	Fornecedor deleteById(long id);
}
