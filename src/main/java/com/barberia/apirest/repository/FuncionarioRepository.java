package com.barberia.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barberia.apirest.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	Funcionario findById(long id);
	
	Funcionario deleteById(long id);
}
