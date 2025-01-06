package com.kodnest.serialization.intro;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee("Arun", 1678, "Rose Villa");
		System.out.println(e.name + " " + e.id);
		try {
			String path = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\Employee.txt";
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(e);
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
