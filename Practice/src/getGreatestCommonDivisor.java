package com.kodnest.practice.revision;

public class getGreatestCommonDivisor {
	int getGCD(int num1, int num2) {
		while(num2 != 0) {
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
//			System.out.println("num1 " + num1);
//			System.out.println("num2 " + num2);
		}
		return num1;
	}
}
