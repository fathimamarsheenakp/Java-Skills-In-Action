package com.kodnest.dsa.array;

import java.util.Scanner;

public class ArrayTraversal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
