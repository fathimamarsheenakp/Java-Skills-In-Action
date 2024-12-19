package com.kodnest.multithreading.thread;

import java.util.Scanner;

public class Activity extends Thread {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		if (name.equals("login")) {
			login();
		} else if (name.equals("print")) {
			print();
		} else {
			add();
		}
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
	
	public void print() {
		try {
			System.out.println("PRINTING ACTIVITY STARTED");
			for (int i = 0; i < 5; i++) {
				System.out.println("KODNEST");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PRINTING ACTIVITY ENDED");
	}
	
	public void add() {
		try {
			System.out.println("ADDITION ACITIVITY STARTED");
			int a = 12548;
			int b = 21466;
			Thread.sleep(2000);
			long sum = a + b;
			System.out.println("ADDITION RESULT IS " + sum);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ADDITION ACITIVITY ENDED");
	}
}
