package com.kodnest.ManyToOneMapping;

import java.util.ArrayList;
import java.util.List;

public class App {
	
    public static void main(String[] args) {
    	
    	Department department = new Department("Development");
    	Employee e1 = new Employee("Aman", 50000, department);
    	Employee e2 = new Employee("Meena", 45000, department);
    	Employee e3 = new Employee("Kiran", 70000, department);
    	
    	List<Employee> list = new ArrayList<Employee>();
    	list.add(e1);
    	list.add(e2);
    	list.add(e3);
    	department.setDeptlist(list);
    	
    	
    }
}
