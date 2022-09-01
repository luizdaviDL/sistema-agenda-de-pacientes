package com.adenda.agenda.transform;

import com.adenda.agenda.copia.PacienteCopia;
import com.adenda.agenda.entities.Paciente;

public class Conversor {

	public static Paciente trans (PacienteCopia pa) {
		Paciente resu = new Paciente();
		resu.setNome(pa.getNome());
		resu.setSobrenome(pa.getSobrenome());
		resu.setCpf(pa.getCpf());
		resu.setEmail(pa.getEmail());
		return resu;
	}
	
}
