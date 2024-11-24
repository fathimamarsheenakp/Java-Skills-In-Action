package practice.array;

import java.util.Scanner;

public class ArraySumCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter length of the array: ");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Array is: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Sum of the elements is: " + calculateSum(arr));
	}
	
	public static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
