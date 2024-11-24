package com.kodnest.dsa.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter length of the array: ");
		int len = scanner.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter array values");
		for(int i = 0; i <= arr.length -1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
