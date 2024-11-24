package com.kodnest.oops.innerclass;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee.Name name = new Employee.Name("Srudhi", "Kumari" ," Gupta");
//		can use class.innerClass instead of importing class
		Employee employee = new Employee();
		employee.name = name;
		employee.name.displayName();
		employee.age = 25;
		employee.salary = 2000000;
		System.out.println("EMPLOYEE DETAILS: ");
		System.out.println("Name : " + employee.name.fn + " " + employee.name.mn + " " + employee.name.ln);
		System.out.println("Age: " + employee.age);
		System.out.println("Salary: " + employee.salary);
		
	}
}
