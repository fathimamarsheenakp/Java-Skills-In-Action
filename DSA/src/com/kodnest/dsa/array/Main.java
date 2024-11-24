package com.kodnest.dsa.array;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		for (String x : args) {
			System.out.print(x + " ");
			sum = sum + Integer.parseInt(x);
		}
		
		System.out.println();
		System.out.println("Sum is: " + sum);
	}
}
