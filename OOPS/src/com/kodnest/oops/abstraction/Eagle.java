package com.kodnest.oops.abstraction;

public abstract class Eagle extends Bird {


	@Override
	void sleep() {
		System.out.println("Eagle sleeps very less time");

	}

	@Override
	void fly() {
		System.out.println("Eagle flies very fast");

	}

}
