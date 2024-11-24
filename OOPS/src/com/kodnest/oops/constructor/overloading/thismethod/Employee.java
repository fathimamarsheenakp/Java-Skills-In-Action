package com.kodnest.oops.constructor.overloading.thismethod;

public class Employee {

	String name;
	int age;
	
	public Employee() {
		this(26);
		this.name = "Omkar";
		this.age = 22;
	}
	
	public Employee(String name) {
		this();
		this.name = name;
		this.age = 22;
	}
	
	public Employee(int age) {
		this.name = "Prahlad";
		this.age = age;
	}
	
	public Employee(String name, int age) {
		this("Bharadwraj");
		this.name = name;
		this.age = age;
	}
}

