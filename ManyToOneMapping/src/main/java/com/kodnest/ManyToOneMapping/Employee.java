package com.kodnest.ManyToOneMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	int salary;
	
	@ManyToOne
	@JoinColumn (name = "did", referencedColumnName = "id")
	Department department;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public Employee(String name, int salary, Department department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
