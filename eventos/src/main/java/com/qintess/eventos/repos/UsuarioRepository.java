package com.qintess.eventos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.eventos.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Usuario findByNome(String nome);

}
