package practice.string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine().toLowerCase();
		char ch = firstNonRepeatingChar(str);
		if (ch != '\0') {
			System.out.println("First Non Repeating Character is " + ch);
		} else {
			System.out.println("There is no First Non Repeating Character");
		}

	}
	
	public static char firstNonRepeatingChar(String str) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			lhm.put(ch, lhm.getOrDefault(ch, 0) + 1);
		}
		
		for (Entry<Character, Integer> entry : lhm.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '\0';
	}

}
