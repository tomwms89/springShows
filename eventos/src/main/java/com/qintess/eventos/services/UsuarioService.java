package com.qintess.eventos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.eventos.models.Usuario;
import com.qintess.eventos.repos.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void insereUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);		
		
	}

}
