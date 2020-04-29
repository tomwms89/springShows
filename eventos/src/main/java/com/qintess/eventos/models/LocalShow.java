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
public class LocalShow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String nomeLocal;
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private int capacidade;
	
	@OneToMany(mappedBy = "localId")
	private List<Evento> evento = new ArrayList<>();
	
	
	public LocalShow() {}
	
	public LocalShow(String nomeLocal, String endereco, int capacidade) {
		this.nomeLocal = nomeLocal;
		this.endereco = endereco;
		this.capacidade = capacidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "LocalShow [id=" + id + ", nomeLocal=" + nomeLocal + ", endereco=" + endereco + ", capacidade="
				+ capacidade + ", evento=" + evento + "]";
	}
	
}
