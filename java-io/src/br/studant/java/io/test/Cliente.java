package br.studant.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String profissao; 
	private String cpf; 
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String profissao, String cpf) {
		super();
		this.nome = nome;
		this.profissao = profissao;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
