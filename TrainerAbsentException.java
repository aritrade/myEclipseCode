package com.dallas.exception.newone.example;

public class TrainerAbsentException extends Exception{
	private String message;
	public TrainerAbsentException(String message)
	{
		super(message);
		this.message = message;
	}
	
	public String toString()
	{
		return this.message;
	}
	

}
