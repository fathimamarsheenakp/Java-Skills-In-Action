package com.kodnest.exception.propogation;

import java.util.Scanner;

public class Demo3 {

	void divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for division");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("Division Result " + c);
	}
}
