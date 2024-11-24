package com.kodnest.dsa.sortingalgo;

import java.util.Scanner;

public class SelectionSort {

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
		int[] sortedArr = selectionSort(arr);
		System.out.print("After sorting: ");
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {
			int min = arr[i];
			int pos = i;
			
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (min > arr[j]) {
					min = arr[j];
					pos = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return arr;
	}
}
