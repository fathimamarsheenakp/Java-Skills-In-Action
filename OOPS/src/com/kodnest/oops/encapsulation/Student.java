package com.kodnest.oops.encapsulation;

public class Student {

	private String name;
	private int age;
	private String gender;
	
//	public Student(String name, int age, String gender) {
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void eat() {
		System.out.println(name + " is eating BIRIYANI");
	}

	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public void study() {
		System.out.println(name + " is studying");
	}
}
