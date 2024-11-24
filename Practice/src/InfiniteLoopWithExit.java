import java.util.Scanner;

public class InfiniteLoopWithExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			if (n < 0) {
				break;
			}
			else {
				System.out.println("Number is " + n);
			}
		}
		 System.out.println("Loop exited. Goodbye!");
	}

}
