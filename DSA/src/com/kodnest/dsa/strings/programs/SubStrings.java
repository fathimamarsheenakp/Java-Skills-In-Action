package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.nextLine();
		getStrings(str);
	}
	public static void getStrings(String str) {
		int length = 0;
		String subString = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i,j);
				if (isPalindrome(sub)) {
					if (length < sub.length()) {
						length = sub.length();
						subString = sub;
					}
				}
			}
		}
		System.out.println(subString);
	}
	public static boolean isPalindrome(String subString) {
		String rev = "";
		for (int i = subString.length() - 1; i >= 0; i--) {
			rev = rev + subString.charAt(i);
		}
		if (subString.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
}
