package com.kodnest.practice.revision;

public class reverseNumber {
	int checkReverse(int num) {
		int result = 0;
		while (num != 0) {
			int digit = num % 10;
			result = result * 10 + digit;
			num /= 10;
		}
		return result;
	}

}
/*  
 153
 3*10 + 5
 35*10 + 1
 
 */
