public class Demo1 extends InfiStandards{

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int sub(int a, int b) {

		return a - b;
	}

	@Override
	public int mul(int a, int b) {

		return a * b;
	}

	@Override
	public int div(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		} else {
			return a / b;
		}

		
	}

	@Override
	public int rem(int a, int b) {

		return a % b;
	}

	@Override
	public boolean checkPrime(int number) {
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

	@Override
	public void fibonacciSeriesPrint(int untiln) {

		int N = untiln;
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

	@Override
	public int power(int num, int exp) {
		int pow = (int)Math.pow(num, exp);
		return pow;
	}

	@Override
	public boolean checkPalindrome(int number) {
		int num = number;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if(number == sum) {
			return true;
		} else {
			return false;
		}
	}
		
}

