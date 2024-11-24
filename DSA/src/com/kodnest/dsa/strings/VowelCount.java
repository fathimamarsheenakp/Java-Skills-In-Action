package com.kodnest.dsa.strings;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine().toLowerCase();
		
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				count++;
			}
		}
		int vcount = getCount(str);
		System.out.println("Count Of vowel in the String " + str.toUpperCase() + " is " + vcount);
		
	}
	public static int getCount(String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
