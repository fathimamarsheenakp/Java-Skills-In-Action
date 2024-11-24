package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class StringRotationManipulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.nextLine();
		System.out.println("Enter how many positions to rotate");
		int number = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Where to rotate ?(left/right)");
		String choice = scanner.nextLine().toLowerCase();
		
		System.out.println("----------------------------------------------------");
		System.out.println("After Rotation: " + rotateString(str, number, choice));
	}
	
	public static String rotateString(String str,int n, String choice) {
		String newStr = str + str;
		int len = str.length();
		String res = "";
		switch(choice) {
		case "left":
			for (int i = n; i < newStr.length() - (len - n); i++) {
				res = res + newStr.charAt(i);
			}
			break;
			
		case "right":
			for (int i = len - n; i < newStr.length() - n; i++) {
				res = res + newStr.charAt(i);
			}
			break;
			
		default :
			res = "please enter correct choice!";
		}
		return res;
	}

}
