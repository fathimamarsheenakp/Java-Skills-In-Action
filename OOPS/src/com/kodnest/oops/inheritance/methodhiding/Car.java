package com.kodnest.oops.inheritance.methodhiding;

public class Car extends Vehicle{
	String name = "Lambo";
	
	void start() {
		System.out.println(name + " is starting...");
	}
	static void drive() {
		System.out.println("Car is being driven..");
	}
	
	void stop() {
		System.out.println(name + " is stopping...");
	}
}
