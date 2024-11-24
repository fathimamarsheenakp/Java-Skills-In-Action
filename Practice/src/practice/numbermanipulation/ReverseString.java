package practice.numbermanipulation;

public class ReverseString {
	public String reverseString(String str) {
		String rev = "";
		int n = str.length();
		for (int i = n-1; i >= 0;i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
