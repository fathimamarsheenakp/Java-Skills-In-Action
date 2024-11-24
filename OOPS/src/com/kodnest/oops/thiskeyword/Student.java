package com.kodnest.oops.thiskeyword;

public class Student {

	String name;
	int age;
	String gender;
	int marks;
	
//	user defined constructor
	public Student(String name, int age, String gender, int marks) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	void study() {
		System.out.println(name + " is studying");
	}
}
