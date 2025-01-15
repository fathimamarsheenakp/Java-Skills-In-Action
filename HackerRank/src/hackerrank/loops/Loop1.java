package hackerrank.loops;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j <= 3; j++) {
			System.out.println("Enter the numbers");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			
			if (n == 0 ) {
				continue;
			} else {
				int s = a;
//				System.out.print(s + " ");
				for(int i = 0; i < n; i++) {
					int k = (int)Math.pow(2, i);
					s = s + k * b;
					System.out.print(s + " ");
					
				}
			}
		}
		
		scanner.close();
	}
}
