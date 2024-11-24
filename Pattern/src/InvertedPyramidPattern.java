import java.util.Scanner;

public class InvertedPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		getPattern(n);

	}
	
	static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i*2-1; j++) {
				System.out.print("-");
			}
			for (int j = n; j >= i*2-1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
