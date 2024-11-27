package com.kodnest.dsa.collections.set;

import java.util.Objects;

public class Product {
	int id;
	String name;
	int cost;
	public Product(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + cost + " ";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Product ref = (Product)obj;
		if (this.id == ref.id && this.name.equals(ref.name) && this.cost == ref.cost) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name, cost);
	}
	
}
