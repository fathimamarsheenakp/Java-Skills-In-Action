package com.kodnest.dsa.strings;

public class ConcateDemo {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		
		String str1 = s1 + s2;
		String str2 = s1 + s2;
		
		if (str1 == str2) {
			System.out.println("REFERENCES are EQUAL");
		} else {
			System.out.println("REFERENCES are NOT EQUAL");
		}
		
		if (str1.equals(str2)) {
			System.out.println("STRINGS are EQUAL");
		} else {
			System.out.println("STRINGS are NOT EQUAL");
		}
		System.out.println("========================================");
		
		String str3 = "Rama" + "Sita";
		String str4 = "Rama" + "Sita";
		
		if (str3 == str4) {
			System.out.println("REFERENCES are EQUAL");
		} else {
			System.out.println("REFERENCES are NOT EQUAL");
		}
		
		if (str3.equals(str4)) {
			System.out.println("STRINGS are EQUAL");
		} else {
			System.out.println("STRINGS are NOT EQUAL");
		}
	}
}
