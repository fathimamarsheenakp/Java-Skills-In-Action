
import java.util.Scanner;

public class FactorialMethod4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // instatiating Scanner object
		System.out.println("Enter a number");
		int n = sc.nextInt(); //take input from the user and assign it to the variable
		System.out.println();
		int fact = factorial(n);
		System.out.println("factorial of " + n + " is " + fact);
	}
	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact *= i;
			System.out.println(fact + " * " + (i) + " = " + fact);
		}
		System.out.println();
		return fact;
	}
}