package com.kodnest.exception.managingexception.ducking;

public class Bank {

	void initiate() throws Exception {
		try {
			System.out.println("Connection to bank server established");
			ATM atm = new ATM();
			atm.login();
//			System.out.println("Issue Reached Bank");
		} finally {
			System.out.println("Connection to bank server terminated");
		}
	}
}
