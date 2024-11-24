package practice.numbermanipulation;

public class GetFibonacciSeries {
	public void getSeriesOfLimit(int n) {
		int fib1 = 0;
		int fib2 = 1;
		if (n == 1) {
			System.out.println(fib1);
		} else if (n == 2) {
			System.out.println(fib1 + " " + fib2);
		}else if (n == 0 ) {
			System.out.println();
		} else {
			System.out.print(fib1 + " " + fib2);
			for (int i = 3; i <= n; i++) {
				int next = fib1 + fib2;
				System.out.print(" " + next);
				fib1 = fib2;
				fib2 = next;
			}
			System.out.println();
		}
	}
	
	void getSeriesUpToN(int n) {
		int fib1 = 0;
		int fib2 = 1;
		if (n == 0 ) {
			System.out.println(fib1);
		} else {
			int next = fib1 + fib2;
			System.out.print(fib1 + " " + fib2);
			for (int i = 3; next <= n; i++) {
				System.out.print(" " + next);
				fib1 = fib2;
				fib2 = next;
				next = fib1 + fib2;
				}
			System.out.println();
		}
	}
}
