package com.springboot1.assignment.main.exception;
public class InvalidIdException extends Exception{

	private static final long serialVersionUID = 1L;

	private String message;
	
	
	public InvalidIdException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}
}