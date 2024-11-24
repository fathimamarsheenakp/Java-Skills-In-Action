import java.util.Scanner;

public class Char1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		char ch = firstCharacter(str);
		System.out.println("First character of the string is " + ch);
		

	}
	public static char firstCharacter(String str) {
		return str.charAt(0);
	}

}
