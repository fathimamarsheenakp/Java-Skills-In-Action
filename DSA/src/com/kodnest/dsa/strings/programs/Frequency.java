package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.nextLine();
		
		getFrequency(str);
	}
	
	public static void getFrequency(String str) {
		int[] frequency = new int[127];
		
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			int ascii = (int)ch;
			frequency[ascii]++;
		}
		
		for (int i = 0; i <= str.length() - 1; i++) {
			char letter = str.charAt(i);
			int index = (int)letter;
			if (frequency[index] > 0) {
				System.out.println(letter + ": " + frequency[index]);
				frequency[index] = 0;
			}
		}
		
	}
}
