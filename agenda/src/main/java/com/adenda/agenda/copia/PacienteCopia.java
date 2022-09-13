package com.adenda.agenda.copia;

import javax.validation.constraints.NotBlank;

public class PacienteCopia {

	@NotBlank(message="campo nome não pode ser vazio")
	private String nome;
	@NotBlank(message="campo sobrenome não pode ser vazio")
	private String sobrenome;
	@NotBlank(message="campo cpf não pode ser vazio")
	private String cpf;
	private String email;
	
	public PacienteCopia(String nome, String sobrenome, String cpf, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.email = email;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
