package com.qintess.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.eventos.services.LocalShowService;

@Controller
@RequestMapping("/cadastro-local")
public class CadastraLocalShowController {
	
	@Autowired
	private LocalShowService localShowService;
	
	@RequestMapping("")
	public String carregaLocalShow() {
		return "cadastro-local";
	}

}
