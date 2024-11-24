package com.kodnest.practice.revision;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		BinaryofDecimal b = new BinaryofDecimal();
		System.out.println("Binary of " + number + " is " + b.getBinary(number));

	}

}
