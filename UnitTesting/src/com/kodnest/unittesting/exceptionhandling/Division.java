package com.kodnest.unittesting.exceptionhandling;

public class Division {

	public static int divide(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator cannot be zero");
		}
		
		return numerator / denominator;
	}
}
