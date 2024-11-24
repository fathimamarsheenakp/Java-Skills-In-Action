import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.nextLine();
		System.out.println("Enter a number");
		double n = scanner.nextDouble();
		System.out.printf("%-15s%07.3f%n", str , n);
//		System.out.printf("%-15s%03d%n", str, n);
	}
}
