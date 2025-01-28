package com.kodnest.OneToOneMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int pid;
	
	@Column
	String productname;
	
	@Column
	int price;
	
	@Column
	int stock;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "pimageid", referencedColumnName = "pimageid")
	Productimage pimage;
	
	public Product() {
		
	}

	public Product(String productname, int price, int stock, Productimage pimage) {
		super();
		this.productname = productname;
		this.price = price;
		this.stock = stock;
		this.pimage = pimage;
	}

	public Product(int pid, String productname, int price, int stock, Productimage pimage) {
		super();
		this.pid = pid;
		this.productname = productname;
		this.price = price;
		this.stock = stock;
		this.pimage = pimage;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Productimage getPimage() {
		return pimage;
	}

	public void setPimage(Productimage pimage) {
		this.pimage = pimage;
	}
}
