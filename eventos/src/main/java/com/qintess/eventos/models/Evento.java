package com.qintess.eventos.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private int qtd_ingressos;
	
	@Column(nullable = false)
	private double preco;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	
	@ManyToOne
	private LocalShow localId;
	
	@OneToMany(mappedBy = "eventoId")
	private List<Ingresso> ingresso;
	
	@OneToMany(mappedBy = "id")
	private List<Pedido> pedido = new ArrayList<>();
	
	public Evento() {}
		
	public Evento(String nome, String descricao, int qtd_ingressos, double preco, Date data, LocalShow localId) {
		this.nome = nome;
		this.descricao = descricao;
		this.qtd_ingressos = qtd_ingressos;
		this.preco = preco;
		this.data = data;
		this.localId = localId;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtd_ingressos() {
		return qtd_ingressos;
	}
	public void setQtd_ingressos(int qtd_ingressos) {
		this.qtd_ingressos = qtd_ingressos;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", qtd_ingressos=" + qtd_ingressos
				+ ", preco=" + preco + ", data=" + data + ", localId=" + localId + "]";
	}

}
