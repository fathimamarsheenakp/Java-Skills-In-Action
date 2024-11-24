package com.kodnest.oops.compositionandaggregration;

public class Students extends Human {

	int id;
	int marks;
	int aggregate;
	int phone;
	
	void print() {
		System.out.println("STUDENT DETAILS: " + name + " " + age + " " + gender + " " + id + " " + marks + " " + phone);
	}
	
	Brain brain = new Brain();
	void displayBrain() {
		System.out.println("Brain details: " + brain.color + " " + brain.weight);
	}
	
	Car car;
	
	void displayCar() {
		System.out.println("Car details: " + car.brand + " " + car.color + " " + car.cost);
	}
	
	
}
