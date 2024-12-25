package practice.string;

import java.util.HashMap;
import java.util.Scanner;

public class CheckIsomorphicString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1 = sc.next();
		String str2 = sc.next();
		
		if (isIsomorphic(str1, str2)) {
			System.out.println("Isomorphic");
		} else {
			System.out.println("Not Isomorphic");
		}
	}
	
	public static boolean isIsomorphic(String str1, String str2) {
		HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
		
		if (str1.length() != str2.length()) {
			return false;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (!m1.containsKey(str1.charAt(i))) {
					m1.put(str1.charAt(i), i);
				}
				if (!m2.containsKey(str2.charAt(i))) {
					m2.put(str2.charAt(i), i);
				}
				
				if (!m1.get(str1.charAt(i)).equals(m2.get(str2.charAt(i)))) {
					return false;
				}
			}
		}
		
		return true;
	}
}
