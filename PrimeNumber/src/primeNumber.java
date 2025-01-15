import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		CheckPrime check = new CheckPrime();
		if(check.isPrime(number)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
		scanner.close();
	}
}
