package com.kodnest.practice.revision;

import java.util.Scanner;

public class reverseNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int number = sc.nextInt();
		reverseNumber r = new reverseNumber();
		System.out.println("Reverse of the number " + number + " is " + r.checkReverse(number));

	}

}
