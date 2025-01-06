package com.kodnest.serialization.intro;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	String name;
	int id;
	String address;
	

	public Employee(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	
}
