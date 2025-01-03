package com.kodnest.dsa.sortingalgo;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr, 0, n - 1);
		System.out.println("After sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			
			merge(arr, low, mid, high);
			
		}
	}
	
	public static void merge(int[] arr, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[low + i];
		}
		
		for (int i = 0; i < n2; i++) {
			rightArray[i] = arr[mid + 1 + i];
		}
		
		int i = 0;
		int j = 0;
		int k = low;
		
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
