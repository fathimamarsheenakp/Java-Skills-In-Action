import java.util.Scanner;

public class HourglassPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		getPattern(n);

	}
	
	 static void getPattern(int n) {
	        // Top half of the hourglass
	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = 1; j < i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= (2 * (n - i) + 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        // Bottom half of the hourglass
	        for (int i = 1; i < n; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= (n - i - 1); j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= (2 * i + 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
