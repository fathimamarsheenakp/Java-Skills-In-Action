package com.kodnest.practice.revision;

public class AmstrongNumber {
	boolean checkAmstrong (int num) {
		int originalDigit = num;
		int count = getDigitCount(num);
		
		int finalDigit = 0;
		
		while (num != 0 ) {
			int rem = num % 10;
			finalDigit += getPower(rem, count);
			System.out.println("Answer " + finalDigit);
			num /= 10;
		}
		System.out.println("Final digit " + finalDigit);
		if (finalDigit == originalDigit) {
			return true;
		} else {
			return false;
		}
	}
	
	static int getDigitCount (int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
	
	static int getPower(int digit, int raiseNumber) {
		int result = 1;
		for (int i = 1; i <= raiseNumber; i++) {
			result = result * digit;
			System.out.println(i + "-" + result);
		}
		return result;
	}
}
