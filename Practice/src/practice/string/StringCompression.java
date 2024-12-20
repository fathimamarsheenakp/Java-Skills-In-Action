package practice.string;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		
		System.out.println("String after compression is " + compressString(str));
	}
	
	public static String compressString(String str) {
		StringBuffer sb = new StringBuffer();
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				sb.append(str.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		
		sb.append(str.charAt(str.length() - 1)).append(count);
		
		return sb.length() < str.length() ? sb.toString() : str;
		
	}
}
