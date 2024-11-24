package com.kodnest.oops.encapsulation;

public class Bank {
	private int accNo;
	private int pswd;
	private double balance;
	
	public Bank(int accNo, int pswd, double balance) {
		super();
		
		if (accNo > 0) {
			this.accNo = accNo;
		}
		
		if (pswd > 0) {
			this.pswd = pswd;
		}
		
		if (balance > 5000) {
			this.balance = balance;
		}
	}
	public int getAccNo() {
		return accNo;
	}
	public int getPswd() {
		return pswd;
	}
	public double getBalance() {
		return balance;
	}
	
}
