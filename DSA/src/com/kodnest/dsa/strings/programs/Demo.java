package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String str = scanner.nextLine();
		System.out.println("Before Reversing: " + str);
		
		StringManipulation manipulation = new StringManipulation();
		String str1 = manipulation.stringReverse(str);
		System.out.println("After Reversing: " + str1);
		
		System.out.println("==================================================");
//		String str2 = manipulation.getReverse(str);
//		System.out.println("After Reversing: " + str2);
		
		String str3 = manipulation.spclReverse(str);
		System.out.println("New String:" + str3);
		
	}
}
