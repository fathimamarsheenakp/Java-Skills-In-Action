import java.util.Scanner;

public class OddNumbersDoWhileMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		OddNumbersDoWhile odd = new OddNumbersDoWhile();
		odd.oddNumbers(n);

	}

}
