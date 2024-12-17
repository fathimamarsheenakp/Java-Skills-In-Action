package practice.string;

import java.util.Scanner;

public class StringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		System.out.println("Length of the string is " + getLength(str));
	}
	
	public static int getLength(String str) {
		return str.length();
	}
}
