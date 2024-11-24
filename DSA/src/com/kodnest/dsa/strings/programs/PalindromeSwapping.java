package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class PalindromeSwapping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.nextLine();
		
		if (getResult(str)) {
			System.out.println("The string " + str + " can be rearranged to form palindrome");
		} else {
			System.out.println("The string " + str + " cannot be rearranged to form palindrome");
		}
		
	}
	
	public static boolean getResult(String str) {
		int[] freq = new int[126];
		char[] arr = str.toCharArray();
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}
		int oddcount = 0;
		for (int i = 0; i <= freq.length - 1; i++) {
			if (freq[i] > 0) {
				if (freq[i] % 2 != 0) {
					oddcount++;
				}
			}
		}
		return oddcount <= 1;
	}

}
