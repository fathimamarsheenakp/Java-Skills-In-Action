import java.util.Scanner;

public class Method {
// Write a program with methods for arithmetic operations.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for the arithematic operations: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int add = add(num1,num2);
		int sub = sub(num1,num2);
		int mul = mul(num1,num2);
		float div = div(num1,num2);
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + add);
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + mul);
		System.out.println("Dvision of " + num1 + " and " + num2 + " is " + div);

	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static float div(int num1, int num2) {
		return num1 / num2;
	}

}
