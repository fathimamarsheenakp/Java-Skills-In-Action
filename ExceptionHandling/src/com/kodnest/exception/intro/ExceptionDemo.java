package com.kodnest.exception.intro;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("CONNECTION ESTABLISHED");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 number for division");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Division result is " + c);
		} catch (Exception e) {
			System.out.println("ArithemeticException: / by zero");
		}
		
		System.out.println("CONNECTION DISCONNECTED");
		
		
	}
}
