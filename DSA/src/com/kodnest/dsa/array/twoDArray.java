package com.kodnest.dsa.array;

import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dimentions: ");
		int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
				
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print("Enter " + i + " " + j + " element: ");
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println();
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
