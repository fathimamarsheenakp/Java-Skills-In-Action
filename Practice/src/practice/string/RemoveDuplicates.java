package practice.string;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine().toLowerCase();
		System.out.println("After removing duplicates: " + removeDuplicates(str));
		TreeSet<Character> result = new TreeSet<Character>(removeDuplicate(str));
		System.out.println("After removing duplicates using tree: " + result);
	}
	
	public static TreeSet<Character> removeDuplicate(String str) {
		TreeSet<Character> treeSet = new TreeSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			treeSet.add(str.charAt(i));
		}
		return treeSet;
	}
	
	public static String removeDuplicates(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (newStr.indexOf(ch) == -1) {
				newStr = newStr + ch;
			}
		}
		return newStr;
	}
}
