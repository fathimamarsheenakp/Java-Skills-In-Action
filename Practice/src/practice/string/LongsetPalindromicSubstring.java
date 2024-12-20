package practice.string;

import java.util.Scanner;

public class LongsetPalindromicSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		
		System.out.println("Longest Palindromic Substring is " + LongestPalindromicSubstring(str));
	}
	
	public static String LongestPalindromicSubstring(String str) {
		int length = 0;
		String subString = "";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				if (isPalindrome(sub)) {
					if (length < sub.length()) {
						length = sub.length();
						subString = sub;
					}
				}
			}
		}
		return subString;
	}
	
	public static boolean isPalindrome(String subString) {
		String rev = "";
		for (int i = subString.length() - 1; i >= 0; i--) {
			rev = rev + subString.charAt(i);
		}
		if (subString.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
}
