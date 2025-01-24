package com.kodnest.EmployeeManagementSystemProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	int salary;
	
	@Column
	String email;
	
	@Column
	String phone;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
	}

	public Employee(String name, int salary, String email, String phone) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
