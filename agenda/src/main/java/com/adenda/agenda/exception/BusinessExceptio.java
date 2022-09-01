package com.adenda.agenda.exception;

public class BusinessExceptio extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BusinessExceptio(String mensage) {
		super(mensage);
	}

}
