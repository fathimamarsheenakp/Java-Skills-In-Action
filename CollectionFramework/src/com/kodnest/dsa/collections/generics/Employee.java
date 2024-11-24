package com.kodnest.dsa.collections.generics;

public class Employee {

	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = " \n Name: " + name + "\n ID: " + id + "\n Salary: " + salary;  
		return message;
	}
}
