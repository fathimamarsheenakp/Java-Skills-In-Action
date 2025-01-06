package com.kodnest.serialization.intro;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialDemo {

	public static void main(String[] args) {
		try {
			ObjectInputStream os = new ObjectInputStream(new FileInputStream("C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\Student.txt"));
			Student student = (Student) os.readObject();
			
			System.out.println(student.id + " " + student.name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
