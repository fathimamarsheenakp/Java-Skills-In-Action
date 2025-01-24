package com.kodnest.EmployeeManagementSystemProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	
	static SessionFactory factory = null;
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	factory = new Configuration().configure("com/kodnest/EmployeeManagementSystemProject/hibernate.cfg.xml").buildSessionFactory();
    	System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
    	while (true) {
    		System.out.println("=======================================");
    		System.out.println("Press 1 to Add Employee");
    		System.out.println("Press 2 to Delete Employee");
    		System.out.println("Press 3 to Fetch Employee");
    		System.out.println("Press 4 to Update Employee");
    		System.out.println("Press any number to exit"); 
    		System.out.println("=======================================");
    		int ch = sc.nextInt();
	    		switch (ch) {
	    		case 1 -> insertEmployee();
	    		case 2 -> deleteEmployee();
	    		case 3 -> getEmployee();
	    		case 4 -> updateEmployee();
	    		default -> {
	    			factory.close();
	    			System.out.println("                        Thank you                       ");
	    			return;
	    		}
    		}
    	}
    	
    }
    
    public static void insertEmployee() {
    	System.out.println("Enter name, salary, email and phone number to insert");
    	Employee employee = new Employee(sc.next(), sc.nextInt(), sc.next(), sc.next());
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(employee);
    	transaction.commit();
    	session.close();
    }
    
    public static void getEmployee() {
    	System.out.println("Enter id to fetch employee details");
    	int id = sc.nextInt();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Employee obj = session.get(Employee.class, id);
    	if (obj != null) {
    		transaction.commit();
    		System.out.println("EMPLOYEE DETAILS: ");
    		System.out.println(" ID : " + obj.getId() + "\n Name : " + obj.getName() + " \n Salary : " + obj.getSalary() + " \n Email : " + obj.getEmail() + " \n Phone Number : " + obj.getPhone());
    	} else {
    		System.out.println("Employee with id " + id + " is not present.");
    	}
    	session.close();
    }
    
    public static void deleteEmployee() {
    	System.out.println("Enter id to delete employee details");
    	int id = sc.nextInt();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Employee obj = session.get(Employee.class, id);
    	if (obj != null) {
    		session.remove(obj);
    		transaction.commit();
    		System.out.println("Employee with id " + id + " removed.");
    	} else {
    		System.out.println("Employee with id " + id + " is not present.");
    	}
    	session.close();
    }
    
    public static void updateEmployee() {
    	System.out.println("Enter id to update employee details");
    	int id = sc.nextInt();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Employee obj = session.get(Employee.class, id);
    	if (obj != null) {
    		System.out.println("CURRENT DETAILS: ");
    		System.out.println(" Name : " + obj.getName() + " \n Salary : " + obj.getSalary() + " \n Email : " + obj.getEmail() + " \n Phone Number : " + obj.getPhone());
    		System.out.println("Select one of the below to change");
    		System.out.println("--------------------------------------");
    		System.out.println("name | salary | email | phone");
    		System.out.println("--------------------------------------");
    		String ch = sc.next();
    		switch (ch) {
				case "name" -> {
					System.out.println("Enter new name");
					String name = sc.next();
					obj.setName(name);
				}
				
				case "salary" -> {
					System.out.println("Enter new salary");
					int salary = sc.nextInt();
					obj.setSalary(salary);
				}
				
				case "email" -> {
					System.out.println("Enter new email");
					String email = sc.next();
					obj.setEmail(email);
				}
				
				case "phone" -> {
					System.out.println("Enter new phone number");
					String phone = sc.next();
					obj.setPhone(phone);
				}
				default -> {
					System.out.println("Enter new name");
					String name = sc.next();
					obj.setName(name);
				}
			}
    		Employee updated = session.merge(obj);
    		transaction.commit();
    		System.out.println(" Name : " + updated.getName() + " \n Salary : " + updated.getSalary() + " \n Email : " + updated.getEmail() + " \n Phone Number : " + updated.getPhone());
    	} else {
    		System.out.println("Employee with id " + id + " is not present.");
    	}
    	session.close();
    }
}
