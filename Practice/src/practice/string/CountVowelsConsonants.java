package practice.string;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next().toLowerCase();
		int[] arr = CountVowelsAndConsonants(str);
		System.out.println("Vowel count is " + arr[0]);
		System.out.println("Consonant count is " + arr[1]);
	} 
	
	public static int[] CountVowelsAndConsonants(String str) {
		int[] arr = new int[2];
		int vowel = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		arr[0] = vowel;
		arr[1] = consonant;
		return arr;
	}
}
