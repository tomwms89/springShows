package com.qintess.eventos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
	
	public Evento findByNome(String nome);

}
