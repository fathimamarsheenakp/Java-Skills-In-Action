package com.kodnest.dsa.sortingalgo;

import java.util.Scanner;

public class InsertionSortInDesc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Before sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		int[] sortedArr = insertionSort(arr);
		System.out.print("After sorting: ");
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i <= arr.length - 1; i++) {
			int item = arr[i];
			int j = i - 1;
			
			while (j >= 0 && item > arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = item;
		}
		return arr;
	}

}
