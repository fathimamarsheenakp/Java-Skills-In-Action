package com.kodnest.oops.assignment;

public class Demo {

	void addition(int a, int b) {
		int sum = a + b;
	}
	
	void subtraction(int a, int b) {
		int sub = a - b;
	}
	
	void multiplication(int a, int b) {
		int mul = a * b;
	}
	
	void division(int a, int b) {
		if (a == 0 || b == 0) {
			System.out.println("Invalid input");
		} else {
			int div = a / b;
		}
	}
	
	void findingRemainder(int a, int b) {
		if (a == 0 || b == 0) {
			System.out.println("Invalid input");
		} else {
			int rem = a % b;
		}
	}
	
	void power(int a, int b) {
		int pow = (int)Math.pow(a, b);
	}
	
	void nFibonacci(int N) {
		int fib1 = 0;
		int fib2 = 1;
		if (N == 1) {
			System.out.println(fib1);
		} else if(N == 2) {
			System.out.println(fib1 + " " + fib2);
		} else {
			System.out.print(fib1 + " " + fib2);
			int next = fib1 + fib2;
			System.out.print(" " + next);
			fib1 = fib2;
			fib2 = next;
		}
	}
	
	static boolean checkPrime(int number) {
		if (number < 2) {
			return false;
		} else {
			for(int i = 0; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	void getPrime(int number) {
		if(Demo.checkPrime(number)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}
	
	void checkPalindrome(int number) {
		int num = number;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if(number == sum) {
			System.out.println("Plindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
