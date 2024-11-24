package com.kodnest.oops.innerclass;

// MEMBER INNER CLASS

public class Student {

	String name;
	int age;
	
	class Address {
		int doorNo;
		int streetNo;
		String landMark;
		String state;
		String country;
		int pinCode;
		
		public Address(int doorNo, int streetNo, String landMark, String state, String country, int pinCode) {
			super();
			this.doorNo = doorNo;
			this.streetNo = streetNo;
			this.landMark = landMark;
			this.state = state;
			this.country = country;
			this.pinCode = pinCode;
		}
		
		void displayAddress() {
			System.out.println("	Door No: " + doorNo);
			System.out.println("	Street No: " + streetNo);
			System.out.println("	Landmark: " + landMark);
			System.out.println("	State: " + state);
			System.out.println("	Country: " + country);
			System.out.println("	PinCode: " + pinCode);
		}

	}
	
	Address address;
	
	public Student() {
		
	}

	public void setData(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void displayStudentDetails() {
		System.out.println("STUDENT DETAILS: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: ");
		address.displayAddress();
	}
	
}
