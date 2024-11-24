package com.kodnest.oops.superkeyword;

public class Lion extends Animal {

	String name = "RANI";
	
	void eat() {
		super.eat();
		System.out.println("MEAT....");
	}
	
	void displayName() {
		System.out.println(super.name);
		System.out.println(name);
	}
}
