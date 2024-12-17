package practice.string;

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next().toLowerCase();
		if (isPalindrome(str)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}
	}
	
	public static boolean isPalindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String rev = new String(sb);
		if (rev.equals(str)) {
			return true;
		} 
		return false;
	}
}
