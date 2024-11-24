package com.kodnest.dsa.array;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows, columns, and depths of 3D array: ");
		int[][][] arr = new int[scanner.nextInt()][scanner.nextInt()][scanner.nextInt()];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.print("Enter " + i + j + k + " element: ");
					arr[i][j][k] = scanner.nextInt();
				}
			}
		}
		
		System.out.println("3D Array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
