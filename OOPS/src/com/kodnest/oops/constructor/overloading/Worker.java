package com.kodnest.oops.constructor.overloading;

public class Worker extends Employee {

	int salary;
	int rating;
	
	public Worker() {
		this.salary = 100000;
		this.rating = 5;
	}
	
	public Worker(int salary) {
//		super("Rama",25);
		this();
		this.salary = salary;
		this.rating = 4;
	}
	
	public Worker(int salary, int rating) {
		this.salary = salary;
		this.rating = rating;
	}
	
}
