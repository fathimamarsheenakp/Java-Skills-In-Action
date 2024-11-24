package com.kodnest.practice.revision;

public class CheckNumberManipulation {
	public void checkNumber(int num) {
		if (num > 0) {
			System.out.println("Entered number " + num + " is Positive.");
		} else if (num < 0) {
			System.out.println("Entered number " + num + " is Negative.");
		} else {
			System.out.println("Entered number " + num + " is Zero.");
		}
	}
}
