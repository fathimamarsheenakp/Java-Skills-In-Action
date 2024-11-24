package com.kodnest.practice.revision;

import java.util.Scanner;

public class FactorsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		checkFactors c = new checkFactors();
		c.getFcators(number);

	}

}
