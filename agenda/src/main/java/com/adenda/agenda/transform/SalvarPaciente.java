package com.adenda.agenda.transform;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adenda.agenda.entities.Paciente;
import com.adenda.agenda.exception.BusinessExceptio;
import com.adenda.agenda.repository.PacienteRepository;

@Service
@Transactional
public class SalvarPaciente {
	
	@Autowired
	private PacienteRepository repo;

	/*@SuppressWarnings("unlikely-arg-type")*/
	public Paciente save(Paciente pa) {
		 Optional<Paciente> paCpf = Optional.of(repo.findByCpf(pa.getCpf()));
		 
		 boolean existe = false;
		 
		 if(paCpf.isPresent()) {
			 existe = true;
		 }
		 /*
		 if(paCpf.equals(pa.getCpf())) {
			 existe = true;
		 }
		 */
		 if(existe) {
			 throw new BusinessExceptio("CPF já cadastrado");
		 }
		 
		 return repo.save(pa);
		 
	}
}
