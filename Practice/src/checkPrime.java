package com.kodnest.practice.revision;

public class checkPrime {
	boolean getPrime(int num) {
//		int count = 0;
//		if (num >= 1) {
//			for (int i = 1; i <= num; i++) {
//				if(num % i == 0) {
//					count++;
//				}
//			}
//		}
//		if (count == 2) {
//			System.out.println("prime number");
//		} else {
//			System.out.println("Not a Prime number");
//		}
		
		if (num == 2) {
			return true;
		} else {
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					return false;
				} 
			}
			return true;
		}
		
	}
}
