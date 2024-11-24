package com.kodnest.oops.polymorphism;

public class TeacherApp {

	public static void main(String[] args) {
		College college = new College();
		college.acceptTeacher(new PhysicsTeacher());
		college.acceptTeacher(new ChemistryTeacher());
		college.acceptTeacher(new BiologyTeacher());
		
	}
}

//	public static void main(String[] args) {
//		Teacher ref;
//		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
//		ref = physicsTeacher;
//		ref.markAttendance();
//		ref.teach();
//		ref.doExp();
//		
//		ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
//		ref = chemistryTeacher;
//		ref.markAttendance();
//		ref.teach();
//		ref.doExp();
//		
//		BiologyTeacher biologyTeacher = new BiologyTeacher();
//		ref = biologyTeacher;
//		ref.markAttendance();
//		ref.teach();
//		ref.doExp();
//	}
//}
