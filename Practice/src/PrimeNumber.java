package com.kodnest.practice.revision;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generate	d method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
//		checkPrime c = new checkPrime();
//		boolean res = c.getPrime(number);
//		
//		if (res == true) {
//			System.out.println("Prime number");
//		} else {
//			System.out.println("Not prime");
//		}
		
//		checkPrimeNumberRange g = new checkPrimeNumberRange();
//		g.getPrimeNumberInRange(number);
//		
		nPrimeNumbers n = new nPrimeNumbers();
		n.getNPrime(number);
	}

}
