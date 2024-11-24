package com.kodnest.oops.overriding;

public class Demo {

	int display() {
		System.out.println("Hello");
		int a = 10;
		return a;
	}
	
	Animal display1() {
		System.out.println("Holaa");
		return new Animal();
	}
}
