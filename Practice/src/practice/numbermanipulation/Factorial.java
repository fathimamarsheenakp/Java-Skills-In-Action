package practice.numbermanipulation;

public class Factorial {
	public int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact *= i;
			System.out.println(fact + " * " + (i) + " = " + fact);
		}
		System.out.println();
		return fact;
	}
}
