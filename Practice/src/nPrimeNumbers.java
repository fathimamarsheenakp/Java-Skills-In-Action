package com.kodnest.practice.revision;

public class nPrimeNumbers {
	void getNPrime(int n) {
		int count = 0;
		while (true) {
			for (int i = 2; i <= n/2; i++) {
				if (n % i != 0) {
					System.out.println(i);
					count++;
				}
				if (count == n) {
					return;
				}
			}
		}
	}
}
