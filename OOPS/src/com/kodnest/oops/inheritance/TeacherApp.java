package com.kodnest.oops.inheritance;

public class TeacherApp {

	public static void main(String[] args) {
		JavaTrainer java = new JavaTrainer();
		java.markAttendance();
		java.teach();
		
		SQLTrainer sql = new SQLTrainer();
		sql.markAttendance();
		sql.teach();
		
		SoftSkill soft = new SoftSkill();
		soft.markAttendance();
		soft.teach();
	}
}
