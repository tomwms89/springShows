package com.qintess.eventos.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 45)
	private String nome;
	
	@Column(nullable = false, length = 60)
	private String sobrenome;
	
	@Column(nullable = false, length = 100)
	private String email;
	
	@Column(nullable = false, length = 15)
	private String telefone;
	
	@Column(nullable = false, length = 30)
	private String senha;
	
	@OneToMany(mappedBy = "usuarioId")
	private List<Pedido> pedido = new ArrayList<>();
	
	public Usuario() {}

	public Usuario(String nome, String sobrenome, String email, String telefone, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", telefone="
				+ telefone + ", senha=" + senha + "]";
	}
	
}
