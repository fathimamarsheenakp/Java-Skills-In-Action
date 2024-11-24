package practice.numbermanipulation;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		GetFibonacciSeries g = new GetFibonacciSeries();
		System.out.println("Fibonacci Series of " + n);
		g.getSeriesOfLimit(n);
		System.out.println("============================================================");
		System.out.println("Fibonacci Series up to " + n);
		g.getSeriesUpToN(n);
		System.out.println("============================================================");

	}

}
