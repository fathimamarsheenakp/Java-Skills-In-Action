package com.kodnest.dsa.map;

public class Employee {

	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name;
	}
}
