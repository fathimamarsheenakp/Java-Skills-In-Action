package com.kodnest.exception.managingexception;

public class Bank {

	void initiate() {
		System.out.println("Connection to bank server established");
		ATM atm = new ATM();
		atm.login();
		System.out.println("Connection to bank server terminated");
	}
}
