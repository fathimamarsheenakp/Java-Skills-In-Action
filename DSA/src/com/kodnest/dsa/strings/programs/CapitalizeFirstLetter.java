package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.nextLine();
		
		capitalize(str);
		
	}
	
	public static void capitalize(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i <= words.length - 1; i++) {
			words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
		}
		
		String res = String.join(" ", words);
		System.out.println(res);
	}
}
