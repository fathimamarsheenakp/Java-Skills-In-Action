package practice.numbermanipulation;
import java.util.Scanner;

public class CheckPalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		CheckPalindrome p = new CheckPalindrome();
		p.checkPalindrome(str);
	}

}
