package com.kodnest.oops.constructor.overloading;

public class Employee {

	String name;
	int age;
	
	public Employee() {
		this.name = "Omkar";
		this.age = 22;
	}
	
	public Employee(String name) {
		this.name = name;
		this.age = 22;
	}
	
	public Employee(int age) {
		this.name = "Prahlad";
		this.age = age;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
