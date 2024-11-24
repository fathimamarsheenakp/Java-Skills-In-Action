package com.kodnest.oops.inheritance.typecasting;

public class PassengerPlane extends Plane {

	void takeOff() {
		System.out.println("Passenger Plane is taking off...");
	}
	
	void fly() {
		System.out.println("Passenger plane is flying...");
	}
	
	void land() {
		System.out.println("Passenger plane is landing...");
	}
	
	void carryPassenger() {
		System.out.println("Passenger plane is carrying Passenger");
	}
}
