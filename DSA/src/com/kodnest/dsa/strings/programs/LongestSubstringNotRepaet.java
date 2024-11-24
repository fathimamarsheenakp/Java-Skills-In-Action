package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class LongestSubstringNotRepaet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		
		String subString = getSubString(str);
		System.out.println("Longest substring without repeating words: " + subString.length());
	}
	
	public static String getSubString(String str) {
		int length = 0;
		String subString = "";
		
		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String sub = str.substring(i,j);
				if (isUnique(sub)) {
					if (length < sub.length()) {
						length = sub.length();
						subString = sub;
					}
				}
			}
		}
		return subString;
	}
	
	public static boolean isUnique(String subString) {
		for (int i = 0; i <= subString.length() - 1; i++) {
			for (int j = i + 1; j <= subString.length() - 1;j++) {
				if (subString.charAt(i) == subString.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}

