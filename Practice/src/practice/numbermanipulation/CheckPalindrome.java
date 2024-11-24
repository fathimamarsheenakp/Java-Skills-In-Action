package practice.numbermanipulation;

public class CheckPalindrome {
	public void checkPalindrome(String str) {
		String reversed = "";
		int n = str.length();
		int i = n-1;
		while (i >= 0) {
			reversed += str.charAt(i);
			i--;
		}
		System.out.println("Reversed string is " + reversed);
//		cannot use reversed == str bcoz In Java, the == operator checks for reference equality,
//		not content equality. This means it checks whether reversed and str refer to the same object in memory, 
//		not whether they have the same characters.
		if (reversed.equals(str)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
	}
}
