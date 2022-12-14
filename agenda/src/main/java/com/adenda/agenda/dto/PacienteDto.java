package com.adenda.agenda.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.adenda.agenda.entities.Paciente;

public class PacienteDto {
	
	private Long id;
	@NotBlank(message = "Campo nome deve ser preenchido")
	private String nome;
	private String sobrenome;
	private String email;

	public PacienteDto(Paciente pa) {
		
		id = pa.getId();
		nome = pa.getNome();
		sobrenome = pa.getSobrenome();
		email = pa.getEmail();
	}

public PacienteDto(List<Paciente> pa) {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	
}
