package com.kodnest.multithreading.runnable;

import java.util.Scanner;

public class Login2 implements Runnable {

	@Override
	public void run() {
		login();
	}

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN ACTIVITY STARTED");
		System.out.println("Enter userName");
		String user = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		System.out.println("LOGGED IN SUCCESFULLY");
		System.out.println("LOGIN ACTIVITY ENDED");
	}
}
