package com.kodnest.oops.inheritance.typecasting;

public class CargoPlane extends Plane {

	void takeOff() {
		System.out.println("Cargo Plane is taking off...");
	}
	
	void fly() {
		System.out.println("Cargo plane is flying...");
	}
	
	void land() {
		System.out.println("Cargo plane is landing...");
	}
	
	void carryCargo() {
		System.out.println("Cargo plane is carrying cargo");
	}
}
