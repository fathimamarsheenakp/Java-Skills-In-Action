package com.kodnest.practice.revision;

public class getSquare {
	int Square(int num) {
		int square = 0;
		for (int i = 1; i <= num; i++) {
			if (i*i == num) {
				square = num;
			}
		}
		return square;
	}

}
