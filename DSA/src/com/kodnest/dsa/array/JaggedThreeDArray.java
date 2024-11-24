package com.kodnest.dsa.array;

import java.util.Scanner;

public class JaggedThreeDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows, columns, and depths of 3D array: ");
		int[][][] arr = new int[scanner.nextInt()][][];
		
//		arr[0] = new int[3][];
//		arr[1] = new int[2][];
//		arr[2] = new int[4][];
//		
//		arr[0][0] = new int[4];
//		arr[0][1] = new int[3];
//		arr[0][2] = new int[5];
//		
//		arr[1][0] = new int[2];
//		arr[1][1] = new int[3];
//		
//		arr[2][0] = new int[3];
//		arr[2][1] = new int[3];
//		arr[2][2] = new int[2];
//		arr[2][3] = new int[7];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print("Enter number of arrays in " + i + ": ");
			arr[i] = new int[scanner.nextInt()][];
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print("Enter number of arrays in " + i + j + ": ");
				arr[i][j] = new int[scanner.nextInt()];
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.print("Enter " + i + j + k + " element: ");
					arr[i][j][k] = scanner.nextInt();
				}
				System.out.println("------------------------");
			}
			System.out.println("==============================");
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
