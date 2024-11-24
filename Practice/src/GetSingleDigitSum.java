package com.kodnest.practice.revision;

public class GetSingleDigitSum {
	int getSum(int digit) {
		int sum = 0;
		while (digit != 0) {
			int rem = digit % 10;
			sum = sum + rem;
			digit = digit / 10;
		}
		return sum;
	}
}
