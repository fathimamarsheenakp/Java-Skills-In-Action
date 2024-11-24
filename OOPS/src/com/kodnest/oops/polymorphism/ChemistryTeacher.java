package com.kodnest.oops.polymorphism;

public class ChemistryTeacher extends Teacher{

	void markAttendance() {
		System.out.println("Chemistry Teacher is marking attendance");
	}
	
	void teach() {
		System.out.println("Chemistry Teacher is teaching");
	}
	
	void doExp() {
		System.out.println("Chemistry Teacher is doing Chemical Experiment");
	}
}
