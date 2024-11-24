package com.kodnest.dsa.strings;

public class StringFunctions {

	public static void main(String[] args) {
		String str = "Raja Ram Mohan Roy";
		System.out.println("Upper case: " + str.toUpperCase());
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Contains R?: " + str.contains("R"));
		System.out.println("Contains Ram?: " + str.contains("Ram"));
		System.out.println("Starts with R?: " + str.startsWith("R"));
		System.out.println("Starts with Roy?: " + str.startsWith("Roy"));
		System.out.println("Ends with y?: " + str.endsWith("y"));
		System.out.println("Ends with Roy: " + str.endsWith("Roy"));
		System.out.println("Length: " + str.length());
		System.out.println("Index of a: " + str.indexOf('a'));
		System.out.println("Index of Mohan: " + str.indexOf("Mohan"));
		System.out.println("Is empty?: " + str.isEmpty());
		String str1 = "";
		System.out.println(str.isEmpty());
		System.out.println(str1.isBlank());
		System.out.println("Is blank?: " + str.isBlank());
		System.out.println("Repalce 'a' with 'i': " + str.replace('a', 'i'));
		System.out.println("Get string at index of 9: " + str.substring(9));
		System.out.println("Get string between indexes 9 and 14: " + str.substring(9, 14));
		
		char[] arr = str.toCharArray();
		for (char c : arr) {
			System.out.print(c + " ");
		}
		
	}
}
