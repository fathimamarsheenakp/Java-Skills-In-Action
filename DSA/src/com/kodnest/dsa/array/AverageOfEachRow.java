package com.kodnest.dsa.array;

import java.util.Scanner;

public class AverageOfEachRow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Array is: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				 System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j <= arr[i].length - 1; j++) {
				sum = sum + arr[i][j];
//				System.out.print("sum: " + sum);
			}
			double average = sum / arr[i].length;
			System.out.println("Average of row " + i + ": " + average);
		}
		
	}
}
