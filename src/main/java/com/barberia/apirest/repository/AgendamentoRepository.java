package com.barberia.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barberia.apirest.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
	Agendamento findById(long id);
	
	Agendamento deleteById(long id);
}
