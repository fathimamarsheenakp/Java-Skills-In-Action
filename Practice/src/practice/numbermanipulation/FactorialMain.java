package practice.numbermanipulation;
import java.util.Scanner;
public class FactorialMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // instatiating Scanner object
		System.out.println("Enter a number");
		int n = sc.nextInt(); //take input from the user and assign it to the variable
		System.out.println();
		Factorial factorial = new Factorial();
		int fact = factorial.factorial(n);
		System.out.println("factorial of " + n + " is " + fact);
	}
}