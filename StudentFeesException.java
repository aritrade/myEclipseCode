package com.dallas.exception.newone.example;

public class StudentFeesException extends Exception {

	private String message;
	public StudentFeesException(String message)
	{
		super(message);
		this.message = message;
		
	}
	
	public String toString()
	{
		return this.message;
	}
	
	
}
