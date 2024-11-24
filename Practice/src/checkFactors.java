package com.kodnest.practice.revision;

public class checkFactors {
	void getFcators(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}
