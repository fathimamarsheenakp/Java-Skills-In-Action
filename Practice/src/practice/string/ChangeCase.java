package practice.string;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		System.out.println("Uppercase of the string is " + toUpperCase(str));
		System.out.println("Uppercase of the string is " + toLowerCase(str));
	}

	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
	
	public static String toLowerCase(String str) {
		return str.toLowerCase();
	}
}
