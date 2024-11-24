package com.kodnest.oops.abstraction;

public abstract class Sparrow extends Bird {

	@Override
	void sleep() {
		System.out.println("Sparrow sleeps long time");

	}

	@Override
	void fly() {
		System.out.println("Sparrow flies slowly");

	}

}
