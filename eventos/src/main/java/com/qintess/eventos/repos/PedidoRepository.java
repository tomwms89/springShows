package com.qintess.eventos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.eventos.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
