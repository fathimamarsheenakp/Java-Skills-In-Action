package com.kodnest.dsa.array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the dimention of the array: ");
		int[][] arr = new int[scanner.nextInt()][];
		
//		System.out.println("Enter number of students: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print("Number of students in class " + i + ": ");
			arr[i] = new int[scanner.nextInt()];
		}
		System.out.println();
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] = new int[4];
//		arr[3] = new int[5];
		
		for(int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print("Enter " + i + " class " + j + " student" +  " age: ");
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("=======================");
		
		System.out.println("Array elemente are: ");
		for(int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
