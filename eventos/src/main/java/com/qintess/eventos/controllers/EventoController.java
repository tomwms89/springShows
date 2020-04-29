package com.qintess.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.eventos.services.EventoService;

@Controller
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoService eventoService;
	
	@RequestMapping("")
	public String carregaEvento() {
		return "evento";
	}

}
