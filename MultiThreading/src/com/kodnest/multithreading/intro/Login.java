package com.kodnest.multithreading.intro;

import java.util.Scanner;

public class Login {

	void doActivity() {
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
