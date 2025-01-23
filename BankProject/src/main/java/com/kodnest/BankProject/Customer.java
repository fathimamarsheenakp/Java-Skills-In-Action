package com.kodnest.BankProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="customer")
public class Customer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	int accno;
	
	@Column
	String name;
	
	@Column
	String address;
	
	@Column
	String email;
	
	@Column
	String phone;
	
	public Customer() {
		
	}
	
	public Customer(int accno, String name, String address, String email, String phone) {
		super();
		this.accno = accno;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public Customer(int id, int accno, String name, String address, String email, String phone) {
		super();
		this.id = id;
		this.accno = accno;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	@Override
	public String toString() {
		return id + "  " + accno + "  " + name + "  " + address + "  " + email + "  " + phone;
	}
}
