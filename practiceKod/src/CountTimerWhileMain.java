import java.util.Scanner;

public class CountTimerWhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		CountTimerWhile c = new CountTimerWhile();
		c.countTimer(n);
	}

}
