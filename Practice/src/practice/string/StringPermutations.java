package practice.string;

import java.util.*;
import java.util.Scanner;

public class StringPermutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		
		List<String> result = new ArrayList<String>(generatePermutations(str));
		Iterator<String> itr = result.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static List<String> generatePermutations(String str) {
		List<String> result = new ArrayList<String>();
		permute(str, "", result);
		return result;
	}
	
	public static void permute(String str, String prefix, List<String> result) {
		if (str.isEmpty()) {
			result.add(prefix);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			permute(remaining, prefix + currentChar, result);
		}
	}
}
