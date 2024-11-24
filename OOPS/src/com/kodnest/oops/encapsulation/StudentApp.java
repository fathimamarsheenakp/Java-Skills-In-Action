package com.kodnest.oops.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		
//		Student student = new Student("Deepak", 24, "Male");
		Student student = new Student();
		
		student.setName("Deepak");
		student.setAge(22);
		student.setGender("Male");
		
		System.out.println("STUDENT DETAILS: ");
		System.out.println("NAME: " + student.getName());
		System.out.println("AGE: " + student.getAge());
		System.out.println("GENDER: " + student.getGender());
		System.out.println("-------------------------------------------");
		
		student.eat();
		student.sleep();
		student.study();
	}
}
