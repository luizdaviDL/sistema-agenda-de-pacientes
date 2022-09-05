package com.adenda.agenda.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adenda.agenda.copia.PacienteCopia;
import com.adenda.agenda.dto.PacienteDto;
import com.adenda.agenda.service.Pacienteservice;


@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

	@Autowired
	private Pacienteservice service;

	/*save*/
	@PostMapping
	public ResponseEntity<PacienteDto> save(@RequestBody PacienteCopia pa) {
		 PacienteDto serv = service.save(pa);
		 return ResponseEntity.status(HttpStatus.CREATED).body(serv);
	}
	
	
	/*getAll*/
	@GetMapping
	public ResponseEntity<List<PacienteDto>> findAll(){
		List<PacienteDto> servfind = service.findAll();
		 return ResponseEntity.status(HttpStatus.CREATED).body(servfind);
	}
	
	
	/*GetById*/
	@GetMapping(value = "/{id}")
	public ResponseEntity<PacienteDto> id(@PathVariable Long id) {
		PacienteDto serv = service.pegarId(id);
		return ResponseEntity.ok().body(serv);
	}
	
	
}
