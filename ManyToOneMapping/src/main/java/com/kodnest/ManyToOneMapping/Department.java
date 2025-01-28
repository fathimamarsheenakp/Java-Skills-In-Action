package com.kodnest.ManyToOneMapping;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Department {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@OneToMany (mappedBy = "department", cascade = CascadeType.ALL)
	List<Employee> deptlist;
	
	public Department() {
		
	}

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department(String name) {
		super();
		this.name = name;
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

	public List<Employee> getDeptlist() {
		return deptlist;
	}

	public void setDeptlist(List<Employee> deptlist) {
		this.deptlist = deptlist;
	}
	
	
}
