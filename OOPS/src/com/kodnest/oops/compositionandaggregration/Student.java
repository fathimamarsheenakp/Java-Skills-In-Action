package com.kodnest.oops.compositionandaggregration;

public class Student {

	int id = 123;
	String name = "Adhi";
	String email;
	int marks;
	Brain brain = new Brain();
	
	void display() {
		System.out.println(name + "'s " + " brain color is " + brain.color + " and weight is " + brain.weight);
	}
	
	Book ref;
//	void acceptBook(Book ref) {
//		System.out.println(ref.Author + " " + ref.cost + " ");
//	}
	void acceptBook() {
		System.out.println(ref.Author + " " + ref.cost + " ");
	}
}
