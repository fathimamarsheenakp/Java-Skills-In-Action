package com.kodnest.oops.polymorphism;

public class PhysicsTeacher extends Teacher {

	void markAttendance() {
		System.out.println("Physics Teacher is marking attendance");
	}
	
	void teach() {
		System.out.println("Physics Teacher is teaching");
	}
	
	void doExp() {
		System.out.println("Physics Teacher is doing laws Experiment");
	}
}
