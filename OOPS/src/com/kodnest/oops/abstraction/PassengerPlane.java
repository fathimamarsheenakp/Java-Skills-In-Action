package com.kodnest.oops.abstraction;

public class PassengerPlane extends Plane{

	@Override
	void takeOff() {
		System.out.println("Passenger Plane is taking Off from a medium sized runway");

	}

	@Override
	void fly() {
		System.out.println("Passenger Plane is flying in a medium speed");

	}

	@Override
	void land() {
		System.out.println("Passenger Plane is landing on a medium sized runway");

	}
}
