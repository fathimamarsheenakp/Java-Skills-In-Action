package practice.string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string 1");
		String str1 = sc.next();
		System.out.println("Enter a string 2");
		String str2 = sc.next();
		
		if (areAnagrams2(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

	public static boolean areAnagrams(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	public static boolean areAnagrams2(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			int[] frequency = new int[256];
			
			for (char ch : str1.toCharArray()) {
				frequency[ch]++;
			}
			
			for (char ch : str2.toCharArray()) {
				frequency[ch]--;
			}
			
			for (int count : frequency) {
				if (count != 0) {
					return false;
				}
			}
			return true;
		}
	}
}
