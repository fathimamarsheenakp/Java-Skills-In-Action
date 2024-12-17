package practice.string;

import java.util.Scanner;

public class SubstringExtraction {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		System.out.println("Enter start and end index to extract substring");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println("Substring is : " + extractSubstring(str, start, end));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	static String extractSubstring(String str, int start, int end) {
		int size = str.length();
		if (start >= 0 && end < size) {
			String newStr = str.substring(start, end);
			return newStr;
		} 
		return "Invalid inputs";
	}
}
