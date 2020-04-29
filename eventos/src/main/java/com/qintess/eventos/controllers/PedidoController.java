package com.qintess.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.eventos.services.PedidoService;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping("")
	public String carregaPedido() {
		return "pedido";
	}
}
