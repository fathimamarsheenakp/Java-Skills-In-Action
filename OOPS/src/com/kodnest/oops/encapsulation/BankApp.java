package com.kodnest.oops.encapsulation;

public class BankApp {

	public static void main(String[] args) {
		Bank bank = new Bank(22220000, 123456, 150000.32);
		System.out.println("ACCOUNT DETAILS: ");
		System.out.println("Account No: " + bank.getAccNo());
		System.out.println("Password: " + bank.getPswd());
		System.out.println("Balance: " + bank.getBalance());
		
	}
}
