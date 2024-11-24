package practice.numbermanipulation;
import java.util.Scanner;

public class SumOfDigitsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		
		SumOfDigits sum = new SumOfDigits();
		int res = sum.sumOfDigits(n);
		System.out.println("Sum is " + res);
	}

}
