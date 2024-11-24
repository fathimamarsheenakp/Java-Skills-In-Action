package com.kodnest.oops.inheritance.methodtypes;

public class TeacherApp {

	public static void main(String[] args) {
		
		PhysicsTeacher physics = new PhysicsTeacher();
		physics.teach();
		physics.doExperiment();
		
		ChemistryTeacher chemistry = new ChemistryTeacher();
		chemistry.teach();
		chemistry.doExperiment();
		
		BiologyTeacher biology = new BiologyTeacher();
		biology.teach();
		biology.doExperiment();
	}
}
