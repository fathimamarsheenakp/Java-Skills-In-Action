package com.kodnest.oops.copyconstructors;

public class Student {

	String name;
	int age;
	String gender;
	int marks;
	
	public Student(String name, int age, String gender, int marks) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}
	
//	COPY CONSTRUCTOR
	public Student(Student ref) {
		this.name = ref.name;
		this.age = ref.age;
		this.gender = ref.gender;
		this.marks = ref.marks;
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	
}
