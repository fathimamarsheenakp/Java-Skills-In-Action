package com.kodnest.dsa.searchingalgo;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Array is: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("Enter key to search: ");
		int key = scanner.nextInt();
		
		System.out.println();
		int result = binarySearch(arr, key);
		if (result >= 0) {
			System.out.println("Key found at " + result);
		} else {
			System.out.println("Key not found");
		}
	}
	
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
