package com.kodnest.annotations.customannotations;

public class Student {

	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	@setdata(ageValue = "Age should be greater than or equal to 18")
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
