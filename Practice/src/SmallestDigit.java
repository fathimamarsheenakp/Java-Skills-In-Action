package com.kodnest.practice.revision;

public class SmallestDigit {
	int getSmallestDigit(int num) {
		
//		int rem = num % 10;
//		int small = rem;
//		num /= 10;
		int small = 9;
		int smallPos = 0;
		int pos = 1;
		while(num != 0) {
			int rem = num % 10;
	
			if (rem < small) {
				small = rem;
				smallPos = pos;
			}
			
			num /= 10;
			pos++;
		}
		System.out.println("Position of smallest is " + smallPos);
		return small;
	}
	
	int getLargestDigit(int num) {
		int largest = 1;
		int largePos = 0;
		int pos = 1;
		
		while (num != 0) {
			int rem = num % 10;
			if (rem > largest) {
				largest = rem;
				largePos = pos;
			}
			num /= 10;
			pos++;
		}
		System.out.println("Position of largest is " + largePos);
		return largest;
	}

}


// 6754
