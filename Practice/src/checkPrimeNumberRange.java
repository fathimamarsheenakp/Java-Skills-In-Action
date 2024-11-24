package com.kodnest.practice.revision;

public class checkPrimeNumberRange {
	void getPrimeNumberInRange(int num) {
		
//		if (num >= 1) {
			for (int i = 2; i <= num; i++) {
				int count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println(i);
				}
			}
//		}
		
	}
}
