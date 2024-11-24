package com.kodnest.oops.abstraction;

public class CargoPlane extends Plane {

	@Override
	void takeOff() {
		System.out.println("Cargo Plane is taking Off from a huge runway");

	}

	@Override
	void fly() {
		System.out.println("Cargo Plane is flying very slowly");

	}

	@Override
	void land() {
		System.out.println("Cargo Plane is landing on a huge runway");

	}

}
