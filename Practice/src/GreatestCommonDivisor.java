package com.kodnest.practice.revision;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		getGreatestCommonDivisor get = new getGreatestCommonDivisor();
		System.out.println("GCD of " + num1 + " and " + num2 + " is " + get.getGCD(num1, num2));

	}

}
