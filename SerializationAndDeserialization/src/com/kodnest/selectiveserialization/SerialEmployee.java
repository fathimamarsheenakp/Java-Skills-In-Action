package com.kodnest.selectiveserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Akhil", 125, 85000.00, "akhil@123");
		System.out.println(emp.name + " " + emp.id + " " + emp.salary + " " + emp.password);
		
		try {
			
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\SelectEmployee.txt"));
			emp.writeExternal(os);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
