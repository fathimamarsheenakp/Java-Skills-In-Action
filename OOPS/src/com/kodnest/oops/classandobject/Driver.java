package com.kodnest.oops.classandobject;

public class Driver {
	void accept (Car c) {
		System.out.println(c.brand + " " + c.model + " " + c.price);
		c.drive();
	}
}
