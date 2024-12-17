package com.kodnest.looping;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // instantiating Scanner
		for (int i = 0; i <= 4; i++) {
			System.out.println("Enter 2 numbers to perform addition:");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int res = a + b;
			System.out.println("Sum is " + res);
		}
		sc.close();

	}

}
