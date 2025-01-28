package com.kodnest.OneToManyMapping;

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
public class Customer {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@OneToMany (mappedBy = "customer", cascade = CascadeType.ALL)
	List<Product> prodlist;
	
	public List<Product> getProdlist() {
		return prodlist;
	}

	public void setProdlist(List<Product> prodlist) {
		this.prodlist = prodlist;
	}

	public Customer() {
		
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer(String name) {
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
	
	
}
