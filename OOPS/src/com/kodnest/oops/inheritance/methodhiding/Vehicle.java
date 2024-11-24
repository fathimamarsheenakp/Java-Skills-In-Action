package com.kodnest.oops.inheritance.methodhiding;

public class Vehicle {
	void start() {
		System.out.println("Vehicle - car is starting...");
	}
	
	static void drive() {
		System.out.println("Vehicle is being driven..");
	}
	
	void stop() {
		System.out.println("Vehicle is stopping...");
	}
}
