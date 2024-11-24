package com.kodnest.oops.compositionandaggregration;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("NAME = " + student.name + ", ID = " + student.id);
		System.out.println("Brain color = " + student.brain.color + ", Brain weight = " + student.brain.weight);
		
		Book book = new Book();
		student.ref = book;
		student.acceptBook();
//		student = null;
//		student.acceptBook(new Book());
//		student.acceptBook(book);
	}
}
