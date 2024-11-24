import java.util.Scanner;

public class CoderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int n = sc.nextInt();
		Coder c = new Coder();
		c.coder(n);

	}

}
