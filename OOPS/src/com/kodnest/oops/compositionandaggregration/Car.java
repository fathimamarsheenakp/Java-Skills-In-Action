package com.kodnest.oops.compositionandaggregration;

public class Car {

	String brand = "BMW";
	String color = "Black";
	String cost = "75 lakhs";
	
	Engine engine;
	
	void displayEngine() {
		System.out.println("Engine details: " + engine.type);
	}
}
