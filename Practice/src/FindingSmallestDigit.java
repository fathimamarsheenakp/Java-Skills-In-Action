package com.kodnest.practice.revision;

import java.util.Scanner;

public class FindingSmallestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		SmallestDigit s = new SmallestDigit();
		System.out.println("Smallest number is " + s.getSmallestDigit(number));
		System.out.println("Largest number is " + s.getLargestDigit(number));

	}

}
