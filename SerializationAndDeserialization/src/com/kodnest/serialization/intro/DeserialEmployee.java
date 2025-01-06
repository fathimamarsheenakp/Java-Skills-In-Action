package com.kodnest.serialization.intro;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialEmployee {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\Employee.txt");
			ObjectInputStream os = new ObjectInputStream(fis);
			
			Employee emp = (Employee) os.readObject();
			System.out.println(emp.name + "  " + emp.id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
