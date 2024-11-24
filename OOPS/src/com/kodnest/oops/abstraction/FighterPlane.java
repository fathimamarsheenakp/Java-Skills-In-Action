package com.kodnest.oops.abstraction;

public class FighterPlane extends Plane {

	@Override
	void takeOff() {
		System.out.println("Fighter Plane is taking Off from a small runway");

	}

	@Override
	void fly() {
		System.out.println("Fighter Plane is flying very fast");

	}

	@Override
	void land() {
		System.out.println("Fighter Plane is landing on a small runway");

	}
}
