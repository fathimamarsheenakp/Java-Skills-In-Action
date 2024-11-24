package com.kodnest.dsa.sortingalgo;

import java.util.Scanner;

public class BubbleSort {
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
		int[] sortedArr = bubbleSort(arr);
		System.out.print("After sorting: ");
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
