package com.kodnest.practice.revision;

import java.util.Scanner;

public class SingleDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit");
		int number = sc.nextInt();
		
		GetSingleDigitSum get = new GetSingleDigitSum();
		int num = number;
		
		while (number > 9) {
			number = get.getSum(number);
		}
		System.out.println("Single Digit Sum of " + num + " is " + number );

	}

}
