package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class RevereseWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentece: ");
		String str = scanner.nextLine();
		
		System.out.println(stringReverse(str));
	}
	
	 public static String stringReverse(String str) {
		 String[] words = str.split(" ");
		 String[] reversedWords = new String[words.length];
		 for (int i = 0; i <= words.length - 1; i++) {
			 reversedWords[i] =  wordReverse(words[i]);
		 }
		 
		 return String.join(" ", reversedWords);
	 }
	 
	 public static String wordReverse(String str) {
		 String rev = "";
		 for (int i = str.length() - 1; i >=0 ; i--) {
			 rev = rev + str.charAt(i);
		 }
		 
		 return rev;
	 }
}
