package com.kodnest.dsa.searchingalgo;

import java.util.Scanner;

public class MinElementBinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		binarySearch(arr);
	}
	
	public static void binarySearch(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[high] >= arr[low]) {
				high = mid -1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println("Minimum element is: " + arr[low]);
	}
}
