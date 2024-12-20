package practice.string;

import java.util.Scanner;

public class LongestSubStringWithoutRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		
		System.out.println("Longest Sub String Without Repeating is " + lengthOfLongestSubstring(str));
	}
	
	public static String lengthOfLongestSubstring(String str) {
		String sub = "";
		int length = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String subStr = str.substring(i, j);
				if (isUnique(subStr)) {
					if (length < subStr.length()) {
						length = subStr.length();
						sub = subStr;
					}
				}
			}
		}
		return sub;
	}
	
	public static boolean isUnique(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
