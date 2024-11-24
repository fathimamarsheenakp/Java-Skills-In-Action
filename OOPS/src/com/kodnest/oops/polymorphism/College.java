package com.kodnest.oops.polymorphism;

public class College {

	void acceptTeacher(Teacher ref) {
		ref.markAttendance();
		ref.teach();
		ref.doExp();
	}
}
