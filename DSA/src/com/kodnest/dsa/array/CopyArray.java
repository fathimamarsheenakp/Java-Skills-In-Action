package com.kodnest.dsa.array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr1 = new int[scanner.nextInt()];
		System.out.println("Enter array elements: ");
		
		for(int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		System.out.println("FIRST ARRAY");
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		
		int[] arr2 = new int[arr1.length];
		
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println();
		System.out.println("SECOND ARRAY");
		for(int y : arr2) {
			System.out.print(y + " ");
		}
	}
}
