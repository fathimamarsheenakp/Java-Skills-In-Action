import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Determine if a number is even or odd.
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		
		//  Check if an input character is a vowel or consonant.
		
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
			System.out.println("The character is vowel");
		} else {
			System.out.println("The character is a consonant");
		}
		
		
		
	}

}
