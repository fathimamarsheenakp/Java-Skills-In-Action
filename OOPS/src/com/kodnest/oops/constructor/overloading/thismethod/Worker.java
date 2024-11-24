package com.kodnest.oops.constructor.overloading.thismethod;

public class Worker extends Employee {

	int salary;
	int rating;
	
	public Worker() {
		super("Prahlad",200000);
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
		this(600000);
		this.salary = salary;
		this.rating = rating;
	}
	
}