package com.kodnest.exception.intro;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("CONNECTION ESTABLISHED");
		int size = 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers for division");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("DIVISION RESULT IS " + c);
			System.out.println();
			
			System.out.println("Enter array length");
			size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Array Of size " + size + " got created.");
			System.out.println("Enter element and position to store the entered element");
			int element = sc.nextInt();
			int position = sc.nextInt();
			arr[position] = element;
			System.out.println("Element in the position " + position + " is " + arr[position]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: / by 0(ZERO");
		} catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException : give positive arraysize");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException : give index between 0 to " + (size - 1));
		} catch (Exception e) {
			System.out.println("Some other exception occured.");
		}
		
		System.out.println("CONNECTION TERMINATED");
	}
}
