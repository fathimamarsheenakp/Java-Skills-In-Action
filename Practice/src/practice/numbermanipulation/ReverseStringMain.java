package practice.numbermanipulation;
import java.util.Scanner;

public class ReverseStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String str = sc.nextLine();
		ReverseString rev = new ReverseString();
		String reversed = rev.reverseString(str);
		System.out.println("Reversed string is " + reversed);

	}

}
