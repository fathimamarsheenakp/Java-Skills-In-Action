package com.kodnest.oops.inheritance.methodhiding;

public class VehicleApp {

	public static void main(String[] args) {
		Car ref = new Car();
		ref.start();
		ref.drive(); //Car.drive()
		ref.stop();
		
		Vehicle ref2 = new Car();
		ref2.start();
		ref2.drive(); //Vehicle.drive()
		ref2.stop();
	}
}
