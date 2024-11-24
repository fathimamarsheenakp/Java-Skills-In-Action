package com.kodnest.oops.copyconstructors;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student("Prahlad", 22, "Male", 99);
		System.out.println(student.name + " " + student.age + " " + student.gender + " " + student.marks);
		
		Student studentCopy = new Student(student);
		
		student.name = "Omkar";
		student.age = 25;
		student.gender = "male";
		student.marks = 100;
		System.out.println(student.name + " " + student.age + " " + student.gender + " " + student.marks);
		System.out.println(studentCopy.name + " " + studentCopy.age + " " + studentCopy.gender + " " + studentCopy.marks);

	}
}
