package com.kodnest.exception.customeException;

public class Bank {

	void initiate() {
		ATM atm = new ATM();
		try {
			atm.withDraw();
		} catch (Exception e) {
			try {
				atm.withDraw();
			} catch (Exception e1) {
				try {
					atm.withDraw();
				} catch (Exception e2) {
					System.out.println("You are blocked!");
				}
			}
		}
	}
}
