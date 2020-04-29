package com.qintess.eventos.services;

import org.springframework.stereotype.Service;

import com.qintess.eventos.models.Pedido;
import com.qintess.eventos.repos.PedidoRepository;

@Service
public class PedidoService {
	
	private PedidoRepository pedidoRepository;
	
	public void inserePedido(Pedido pedido) {
		pedidoRepository.save(pedido);
		
	}

}
