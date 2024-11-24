package practice.numbermanipulation;
import java.util.Scanner;

public class FirstPairOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int mul = sc.nextInt();
		out : for (int i = 1; i <= 9; i++) {
			in : for (int j = 1; j <= 9; j++) {
				if ((i * j) % mul == 0) {
					System.out.println("( " + i + "," + j + " )");
					break out;
				} else {
					System.out.println("No such pairs found");
				}
			}
		}
		
		

	}

}
