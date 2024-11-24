import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		getPattern(n);

	}
	static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
