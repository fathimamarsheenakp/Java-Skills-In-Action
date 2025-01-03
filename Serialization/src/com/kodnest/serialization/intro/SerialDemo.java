package com.kodnest.serialization.intro;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		try {
			
			Student student = new Student(10, "Murat");
			System.out.println(student.id + " " + student.name);
			System.out.println("This object will be remove within 2ms after program executes");
			
			String path = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\Student.txt";
			
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(student);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
