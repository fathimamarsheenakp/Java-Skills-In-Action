package com.kodnest.OneToManyMapping;

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
public class Product {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String price;
	
	@ManyToOne 
	@JoinColumn(name = "cid", referencedColumnName = "id")
	Customer customer;
	
	public Product() {
		
	}

	public Product(int id, String name, String price, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.customer = customer;
	}

	public Product(String name, String price, Customer customer) {
		super();
		this.name = name;
		this.price = price;
		this.customer = customer;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
