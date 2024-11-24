package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class ExtractDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string with digits: ");
		String str = scanner.nextLine();
		
		System.out.println(getDigits(str));
	}
	
	public static String getDigits(String str) {
		String digits = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digits = digits + ch;
			}
		}
		return digits;
	}
}
