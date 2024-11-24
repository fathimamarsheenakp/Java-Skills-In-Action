
public class ReverseAString {

	public static void main(String[] args) {
		String s = "Geeksforgeeks";
		System.out.println(getReverse(s));
		
	}
	
	public static String getReverse(String s) {
		String str = "";
		int len = s.length();
		for(int i = len-1; i >= 0; i--) {
			str = str + s.charAt(i);
		}
		return str;
	}
}
