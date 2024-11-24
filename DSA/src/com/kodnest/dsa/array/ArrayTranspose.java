package com.kodnest.dsa.array;

import java.util.Scanner;

public class ArrayTranspose {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dimentions: ");
		int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Original Array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
//		1	2	3					1	4				
//		4	5	6					2	5
//									3	6
//										3				2
		int[][] arrTranspose = new int[arr[0].length][arr.length];
//									3		
		for (int i = 0; i <= arrTranspose.length - 1; i++) {
//									2
			for (int j = 0; j <= arrTranspose[i].length - 1; j++) {
				arrTranspose[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transpose of the Array: ");
		for (int i = 0; i <= arrTranspose.length - 1; i++) {
			for (int j = 0; j <= arrTranspose[i].length - 1; j++) {
				System.out.print(arrTranspose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
