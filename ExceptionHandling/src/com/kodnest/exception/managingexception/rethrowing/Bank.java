package com.kodnest.exception.managingexception.rethrowing;

public class Bank {

	void initiate() {
		try {
			System.out.println("Connection to bank server established");
			ATM atm = new ATM();
			atm.login();
		} catch (Exception e) {
			System.out.println("Issue reached at Bank");
		}
		System.out.println("Connection to bank server terminated");
	}
}
