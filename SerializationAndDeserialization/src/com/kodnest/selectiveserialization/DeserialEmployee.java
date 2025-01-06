package com.kodnest.selectiveserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialEmployee {

	public static void main(String[] args) {
		try {
			ObjectInputStream os = new ObjectInputStream(new FileInputStream("C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\SelectEmployee.txt"));
			Employee emp = new Employee();
			emp.readExternal(os);
			System.out.println(emp.name + " " + emp.id + " " + emp.salary + " " + emp.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
