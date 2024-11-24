package com.kodnest.dsa.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the strings");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean flag = true;
		if (arr1.length - 1 == arr2.length - 1) {
			for (int i = 0; i <= arr1.length - 1; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Not Anagram");
					flag = false;
				}
			}
			if (flag = true) {
				System.out.println("The stings are anagram");
			}
		} else {
			System.out.println("The strings are not anagram");
		}
	}
}
