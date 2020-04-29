package com.qintess.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.eventos.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@RequestMapping("")
	public String carregaUsuario() {
		return "usuario";
	}

}
