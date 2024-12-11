package com.kodnest.exception.managingexception.rethrowing;

import java.util.Scanner;

public class ATM {

	public void login() throws Exception{
		System.out.println("Connection to DB Established");
		System.out.println("Enter user id and password numbers to divide and login");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("LOGGED IN!");
		} catch (Exception e) {
			System.out.println("Exception occured and resolved in ATM");
			throw e;
		} finally {
			System.out.println("Connection to DB Terminated");
		}
	}
}
