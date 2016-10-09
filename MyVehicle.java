package com.gamasome.java.classExample;

public class MyVehicle extends Car implements Runnable {
	
	public void run()
	{
		System.out.println("The thread is running..");
	}

}
