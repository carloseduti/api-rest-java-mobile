package com.barberia.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barberia.apirest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);
	
	Produto deleteById(long id);
}
