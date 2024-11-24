package com.kodnest.oops.overriding;

public class Demo1 extends Demo {

	int display() {
		System.out.println("Hello");
		int a = 3;
		return a;
	}
	
	Tiger display1() {
		System.out.println("Holaa");
		Tiger tiger = new Tiger();
		return tiger;
	}
}
