package practice.typecasting;
import java.util.Scanner;

public class DemoChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		System.out.println("Entered character is " + ch);
		
		//add 5 to ch and store it in a variable ch2 and print ch and ch2
		char ch2 = (char) (ch + 5);
		System.out.println("Entered character is " + ch + " and added 5, character is " + ch2);
		
		//convert ch2 to integer and store it into variable x.
		int x = (int)ch2;
		System.out.println("After converting the ch to int,the value is " + x);
		
		// left shift x two times and print the result.
		int result = x<<2;
		System.out.println("After left shift " + result);
		
		//square the result
		int square = square(result);
		System.out.println("Square is " + square);
		
		//cube the result
		int cube = cube(result);
		System.out.println("Cube is " + cube);
		
		sc.close();
		
	}
	
	public static int square(int num)
	{
		return num * num;
	}
	
	public static int cube(int num) {
		return num * num * num;
	}
	
}
