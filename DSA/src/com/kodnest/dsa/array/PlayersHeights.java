package com.kodnest.dsa.array;

import java.util.Scanner;

public class PlayersHeights {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		float[][] arr = new float[scanner.nextInt()][];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print("Enter number of players in game " + i + ": ");
			arr[i] = new float[scanner.nextInt()];
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print("Enter game " + i + " player " + j + " height: ");
				arr[i][j] = scanner.nextFloat();
			}
			System.out.println("--------------------------------");
		}
		
		System.out.println("=================================");
		System.out.println("Array are: ");
		
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
