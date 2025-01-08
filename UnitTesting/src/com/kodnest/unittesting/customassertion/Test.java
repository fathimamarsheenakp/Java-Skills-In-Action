package com.kodnest.unittesting.customassertion;

public class Test {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		assertEqual(10, calc.add(3, 5), "add(3, 5)");
		assertEqual(2,  calc.sub(5, 3), "sub(5, 3)");
		
	}
	
	public static void assertEqual(int expected, int actual, String testName) {
		if (expected == actual) {
			System.out.println("Test passed: " + testName);
		} else {
			System.out.println("Test failed: " + testName + " - Expected " + expected + " but got " + actual);
		}
	}
}
