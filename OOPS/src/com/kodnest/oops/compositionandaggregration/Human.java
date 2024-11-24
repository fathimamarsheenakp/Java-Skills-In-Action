package com.kodnest.oops.compositionandaggregration;

public class Human {

	String name;
	int age;
	String gender;
	
	void display() {
		System.out.println("Human details: " + name + " " + age + " " + gender);
	}
	
	Heart heart = new Heart();
	void displayHeart() {
		System.out.println("Heart details: " + heart.color + " " + heart.weight);
	}
	
	Bike bike;
	void displayBike() {
		System.out.println("Bike details: " + bike.brand + " " + bike.cost);
	}
}
