package com.kodnest.dsa.searchingalgo;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementsArrayOnly {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string-1: ");
		String[] input1 = scanner.nextLine().split("\\s");
		int[] arr1 = new int[input1.length];
		for (int i = 0; i <= input1.length - 1; i++) {
			arr1[i] = Integer.parseInt(input1[i]);
		}
		
		System.out.println("Enter string-2: ");
		String[] input2 = scanner.nextLine().split("\\s");
		int[] arr2 = new int[input2.length];
		for (int i = 0; i <= input2.length - 1; i++) {
			arr2[i] = Integer.parseInt(input2[i]);
		}
		
		int[] intersection = getintersection(arr1, arr2);
		System.out.print("The common elements in 2 arrays are: ");
		for (int i : intersection) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] getintersection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] result = new int[Math.min(arr1.length, arr2.length)];
		int index = 0;
		
		for (int i = 0; i <= arr1.length - 1; i++) {
			if(binarySearch(arr2, arr1[i])) {
				if (index == 0 || result[index - 1] != arr1[i]) {
					result[index++] = arr1[i];
				}
			}
		}
		return Arrays.copyOf(result, index);
	}
	
	public static boolean binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (arr[mid] == target) {
				return true;
			} else if (target > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
}
