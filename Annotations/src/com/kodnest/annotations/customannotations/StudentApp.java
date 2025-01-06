package com.kodnest.annotations.customannotations;

public class StudentApp {

	public static void main(String[] args) {
		Student st = new Student();
		st.setAge(20);
		System.out.println("Age is " + st.getAge());
	}
}
