package practice.typecasting;
import java.util.Scanner;

public class DTandTC {
	// Data type and type casting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a float value: ");
		float num2 = sc.nextFloat();
		
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		float num3 = (int)num1;
		System.out.println("After conversion " + num1 + " becomes " + num3);
		
		int num4 = (int)num2;
		System.out.println("After conversion " + num2 + " becomes " + num4);
		
		int ascii = (int) ch;
		System.out.println("After conversion " + ch + " becomes " + ascii);


	}

}
