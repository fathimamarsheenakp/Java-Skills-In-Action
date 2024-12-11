package com.kodnest.exception.managingexception.rethrowing;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Main Connection Established");
		Bank bank = new Bank();
		bank.initiate();
		System.out.println("Main Connection Terminated");
	}
}
