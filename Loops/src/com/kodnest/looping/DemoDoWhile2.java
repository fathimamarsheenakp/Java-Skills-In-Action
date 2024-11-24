import java.util.Scanner;

public class DemoDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do {
			System.out.println("Enter 2 numbers to perform addition:");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int res = a + b;
			System.out.println("Sum is " + res);
			i++;
		} while ( i<= 4);
		sc.close();

	}

}

