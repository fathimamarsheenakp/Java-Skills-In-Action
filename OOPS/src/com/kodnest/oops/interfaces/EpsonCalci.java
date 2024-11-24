package com.kodnest.oops.interfaces;

import java.util.Scanner;

public class EpsonCalci implements Calculator {

	Scanner scanner = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter two numbers");
		int a = scanner.nextInt();
		int b =  scanner.nextInt();
		if (a == 0 || b == 0) {
			System.out.println("Seriously! You need EpsonCalci to add this......");
		} else {
			System.out.println(a+b);
		}
	}

	@Override
	public void sub() {
		System.out.println("Enter two numbers");
		int a = scanner.nextInt();
		int b =  scanner.nextInt();
		if (a == 0 || b == 0) {
			System.out.println("Seriously! You need EpsonCalci to subtract this......");
		} else {
			System.out.println(a-b);
		}
	}

}
