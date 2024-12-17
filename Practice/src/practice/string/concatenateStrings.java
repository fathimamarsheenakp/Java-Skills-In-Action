package practice.string;

import java.util.Scanner;

public class concatenateStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String str1 = sc.next();
		System.out.println("Enter string 2");
		String str2 = sc.next();
		System.out.println("After concatentation: " + concatenate(str1, str2));
	}
	
	public static String concatenate(String str1, String str2) {
		return str1 + str2;
	}
}
