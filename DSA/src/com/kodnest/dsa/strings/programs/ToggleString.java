package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class ToggleString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.nextLine();
		
		System.out.println("Toggled String: " + toggleString(str));
	}
	
	public static String toggleString(String str) {
		String res = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				res = res + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				res = res + Character.toUpperCase(ch);
			} else {
				res = res + ch;
			}
		}
		return res;
	}
}

// heLlo World