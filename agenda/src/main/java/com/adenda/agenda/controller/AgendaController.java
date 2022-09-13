package com.adenda.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adenda.agenda.copia.AgendaCopia;
import com.adenda.agenda.dto.AgendaDto;
import com.adenda.agenda.service.AgendaService;

@RestController
@RequestMapping(value  = "/agenda")
public class AgendaController {
	
	@Autowired
	private AgendaService service;
	/*Save*/
	
	public ResponseEntity<AgendaDto> save(AgendaCopia pa) {
		AgendaDto agenda = service.save(pa);
		return ResponseEntity.status(HttpStatus.CREATED).body(agenda);
	}
	
	/*get*/

	/*public AgendaDto findAll() {

	} */
}
