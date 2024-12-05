package com.kodnest.dsa.collections.utilitymethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortObjects {

	public static void main(String[] args) {
		Employee e1 = new Employee("Athira", 101, 15000);
		Employee e2 = new Employee("Meera", 102, 25000);
		Employee e3 = new Employee("Milan", 103, 55000);
		Employee e4 = new Employee("Aisha", 104, 35000);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
//		ANONYMOUS INNER TYPE OBJECT
//		Comparator<Employee> cc = new Comparator<Employee>() {
//			
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				Employee ref1 = (Employee) o1;
//				Employee ref2 = (Employee) o1;
//				
//				if (ref1.salary > ref2.salary) {
//					return 1;
//				} else {
//					return -1;
//				}
//				
//			}
//		};
		
//		LAMBDA FUNCTION
		Comparator cc = (Object o1, Object o2) -> {
			Employee ref1 = (Employee)o1;
			Employee ref2 = (Employee)o2;
			if (ref1.salary < ref2.salary) {
				return 1;
			} else {
				return -1;
			}
		};
		System.out.println();
		System.out.println("After sorting");
		Collections.sort(list, cc);
		 for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
