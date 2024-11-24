import java.util.Scanner;

public class FactorialDoWhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int N = sc.nextInt();
		int M = sc.nextInt();
		FactorialDoWhen fact = new FactorialDoWhen();
		int factN =  fact.Factorial(N);
		int factM = fact.Factorial(M);
		System.out.println("Factorial of " + N + " is " + factN);
		System.out.println("Factorial of " + M + " is " + factM);
	}

}
