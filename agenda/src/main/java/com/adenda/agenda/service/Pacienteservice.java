package com.adenda.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adenda.agenda.copia.PacienteCopia;
import com.adenda.agenda.dto.PacienteDto;
import com.adenda.agenda.entities.Paciente;
import com.adenda.agenda.transform.Conversor;
import com.adenda.agenda.transform.SalvarPaciente;

@Service
public class Pacienteservice {


	
	@Autowired
	private SalvarPaciente salvar;
	
	/*save*/
	
	public PacienteDto save(PacienteCopia pa) {
		Paciente transf = Conversor.trans(pa);
		Paciente result = salvar.save(transf);
		PacienteDto dto = new PacienteDto(result);
		return dto;
		
		
	}
}
