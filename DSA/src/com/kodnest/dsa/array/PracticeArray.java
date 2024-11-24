package com.kodnest.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dimentions of array-1: ");
		int[][] arr1 = new int[scanner.nextInt()][scanner.nextInt()];
		
		System.out.println("Enter values of array-1: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			for (int j = 0; j <= arr1[i].length - 1; j++) {
				arr1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter the dimentions of array-2: ");
		int[][] arr2 = new int[scanner.nextInt()][scanner.nextInt()];
		
		System.out.println("Enter values of array-2: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			for (int j = 0; j <= arr2[i].length - 1; j++) {
				arr2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.print("Array-1 : ");
		System.out.println(Arrays.deepToString(arr1));
		
//		System.out.println();
		System.out.print("Array-2 : ");
		System.out.println(Arrays.deepToString(arr2));
		
//		System.out.println();
		System.out.print("After addition: ");
		int[][] addArray = addArray(arr1, arr2);
		System.out.println(Arrays.deepToString(addArray));
		
		System.out.println("Array -1: ");
		getSum(arr1);
		System.out.println("Array -2: ");
		getSum(arr2);
		System.out.println("=================================================");
		System.out.println("SPIRAL TRAVESAL of Array - 1: ");
		spiralTraversal(arr1);
		System.out.println();
		System.out.println("SPIRAL TRAVESAL of Array - 2: ");
		spiralTraversal(arr2);
		
	}
	
	public static int[][] addArray(int[][] arr1, int[][] arr2) {
		int[][] resArray = new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i <= resArray.length - 1; i++) {
			for (int j = 0; j <= resArray[i].length - 1; j++) {
				resArray[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return resArray;
	}
	
	public static void getSum(int[][] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j <= arr[i].length - 1; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of " + i + "th row is " + sum);
		}
	}
	
	public static void spiralTraversal(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[0].length - 1;
		
		
		while (top <= bottom && left <= right) {
			
			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;
			
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;
			
			for (int i = right; i >= left; i--) {
				System.out.print(arr[bottom][i] + " ");
			}
			bottom--;
			
			for (int i = bottom; i >= top; i--) {
				System.out.print(arr[i][left] + " ");
			}
			left++;
		}
		
	}
}
