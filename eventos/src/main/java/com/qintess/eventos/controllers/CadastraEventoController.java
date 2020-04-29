package com.qintess.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.eventos.services.EventoService;
import com.qintess.eventos.services.LocalShowService;

@Controller
@RequestMapping("/cadastro-evento")
public class CadastraEventoController {
	
	@Autowired
	private LocalShowService localShowService;
	
	@Autowired
	private EventoService eventoService;
	
	@RequestMapping("")
	public String carregaCadEvento() {
		return "cadastro-evento";
	}

}
