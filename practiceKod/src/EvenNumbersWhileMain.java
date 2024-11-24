import java.util.Scanner;

public class EvenNumbersWhileMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = sc.nextInt();
		EvenNumbersWhile even = new EvenNumbersWhile();
		even.evenNumber(n);
	}
}
