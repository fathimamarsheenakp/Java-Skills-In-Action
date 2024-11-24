package com.kodnest.dsa.searchingalgo;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Enter key to search: ");
		int key = scanner.nextInt();
		System.out.println();
		
		System.out.print("Array is: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		int result = linearSearch(arr, key);
		if (result >= 0) {
			System.out.println("Key found at " + result);
		} else {
			System.out.println("Key not found");
		}
	}
	
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
