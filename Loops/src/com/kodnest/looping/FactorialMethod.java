import java.util.Scanner;

public class FactorialMethod {

	public static void main(String[] args) {
		factorial();
	}
	public static void factorial() {
		Scanner sc = new Scanner(System.in); // instatiating Scanner object
		System.out.println("Enter a number");
		int n = sc.nextInt(); //take input from the user and assign it to the variable
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact *= i;
			System.out.println(fact + " * " + (i) + " = " + fact);
		}
		System.out.println("factorial of " + n + " is " + fact);
	}
}
