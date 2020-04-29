package com.qintess.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.eventos.models.Evento;
import com.qintess.eventos.repos.EventoRepository;

@Service
public class EventoService {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	public void insereEvento(Evento evento) {
		eventoRepository.save(evento);
	}
	
	public Evento buscaPorNome(String nome) {
		return eventoRepository.findByNome(nome);
	}
	
	public List<Evento> buscaTodos(){
		return eventoRepository.findAll();
	}

}
