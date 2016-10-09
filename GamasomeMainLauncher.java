package com.gamasome.java.classExample;

public class GamasomeMainLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVehicle r = new MyVehicle();
		Thread t = new Thread(r);
		
		
		Car obj = new Car();
		obj.CarMileage();
		System.out.println("Car mileage is really amazing");
		obj.checkAirPressure();
		System.out.println("Air pressure is checked");
		obj.checkFuel();
		System.out.println("Fuel is full tank");
		
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
