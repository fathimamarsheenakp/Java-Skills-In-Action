import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the range");
//		int n = sc.nextInt();
//		
//		System.out.println("Enter the start");
//		int start = sc.nextInt();
		
		int count = 0;
//		int n = 5;
		for (int i = 10; i <= 999 ; i++) {
			if(checkArmstrong(i)) {
				System.out.println(i);
				count++;
			}
//			if (count == n) {
//				break;
//			}
		}
	}
		static boolean checkArmstrong(int n) {
//			int n = 534;
			int number = n;
			String s = "" + n;
			int ex = s.length();
			int sum = 0;
			while (n != 0) {
				int dig = n % 10;
				sum = sum + (int)Math.pow(dig, ex);
				n = n / 10;
			}
			if (number == sum) {
				return true;
			} else {
				return false;
			}
	}
}
