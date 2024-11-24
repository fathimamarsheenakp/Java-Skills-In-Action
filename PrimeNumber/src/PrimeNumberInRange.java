import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start");
		int start = scanner.nextInt();
		
		System.out.println("Enter the end");
		int end = scanner.nextInt();
		
		CheckPrimeInRange check = new CheckPrimeInRange();
		check.printPrime(start, end);
//		if(check.isPrime(number)) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("Not prime");
//		}
	}
}
