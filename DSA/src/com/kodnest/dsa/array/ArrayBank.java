package com.kodnest.dsa.array;

import java.util.Scanner;

public class ArrayBank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of customers: ");
		String[] customer = new String[scanner.nextInt()];
		
//		scanner.nextLine();
		for (int i = 0; i <= customer.length - 1; i++) {
			System.out.print("Enter " + i + "th customer name: ");
			customer[i] = scanner.next();
		}
		
		System.out.print("[ ");
		for (int i = 0; i <= customer.length - 1; i++) {
			if (i < customer.length - 1) {
				System.out.print(customer[i] + " , ");
				
			}
			else {
				System.out.print(customer[i]);
			}
		}
		System.out.print(" ]");
	}
}
