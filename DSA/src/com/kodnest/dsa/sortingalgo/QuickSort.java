package com.kodnest.dsa.sortingalgo;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("Before sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		quickSort(arr, 0, n - 1);
		System.out.println();
		System.out.print("After sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivotElement = arr[high];
		int i = low - 1;
		
		for (int j = low; j < high; j++) {
			if (arr[j] < pivotElement) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		
		return i + 1;
	}
}
