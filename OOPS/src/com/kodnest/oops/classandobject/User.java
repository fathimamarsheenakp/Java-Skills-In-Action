package com.kodnest.oops.classandobject;

public class User {
	
//	instance variables
	String name;
	int id;
	String email;
	String password;
	long phone;
	String course;
	
	void login() {
		System.out.println("Welcome " + name + " You Have Logged In Using " + email);
	}
	
	void joinClass() {
		System.out.println(name + " Has Joined To " + course + " Class");
	}
	
//	local variable
	void markAttendance(int time) {
		if (time > 15) {
			System.out.println("Present");
		} else {
			System.out.println("Absent");
		}
	}
}
