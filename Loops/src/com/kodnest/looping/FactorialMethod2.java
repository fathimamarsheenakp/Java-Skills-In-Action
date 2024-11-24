
import java.util.Scanner;

public class FactorialMethod2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // instatiating Scanner object
		System.out.println("Enter a number");
		int n = sc.nextInt(); //take input from the user and assign it to the variable
		System.out.println();
		factorial(n);
	}
	public static void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact *= i;
			System.out.println(fact + " * " + (i) + " = " + fact);
		}
		System.out.println();
		System.out.println("factorial of " + num + " is " + fact);
	}
}