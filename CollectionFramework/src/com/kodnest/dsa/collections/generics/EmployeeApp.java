package com.kodnest.dsa.collections.generics;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		
		Employee employee = new Employee("Ardra", 215, 84000);
		arrayList.add(employee);
		arrayList.add(new Employee("Hasna", 321, 82049));
		arrayList.add(new Employee("Hritika", 301, 52005));
		arrayList.add(new Employee("Deepak", 310, 92000));
		arrayList.add(new Employee("Ramu", 235, 62000));
		
		System.out.println("Employee Details: ");
		System.out.println(arrayList);
		
	}
}
