package com.kodnest.dsa.map;

public class Student {

	int id;
	String name;
	String gender;
	String address;
	public Student(int id, String name, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + gender + " " + address;
	}
}
