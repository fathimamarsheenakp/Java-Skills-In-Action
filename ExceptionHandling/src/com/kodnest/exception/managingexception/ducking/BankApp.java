package com.kodnest.exception.managingexception.ducking;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Main Connection Established");
		try {
			Bank bank = new Bank();
			bank.initiate();
		} catch (Exception e) {
			System.out.println("Exception Reached and handled in main");
		}
		System.out.println("Main Connection Terminated");
	}
}
