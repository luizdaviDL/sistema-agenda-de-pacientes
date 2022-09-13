package com.adenda.agenda.dto;

import java.time.LocalDateTime;

public class AgendaDto {

	private Long id;
	private String descricao;
	private LocalDateTime data;
	private PacienteDto paciente;
	
	
	public AgendaDto() {
		super();
	}

	public AgendaDto(Long id, String descricao, LocalDateTime data, PacienteDto paciente) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.paciente = paciente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public PacienteDto getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteDto paciente) {
		this.paciente = paciente;
	}
	
	
	
	
	
	
}
