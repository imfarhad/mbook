package com.ongkur.mbook.exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException{
	
	public CustomerNotFoundException(Long id){
		super("Cound not find customer: "+id);
	}
}
