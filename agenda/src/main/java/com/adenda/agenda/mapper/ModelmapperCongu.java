package com.adenda.agenda.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelmapperCongu {
	
	@Bean
	ModelMapper  modalMapper() {
		return new ModelMapper();
	}
}
