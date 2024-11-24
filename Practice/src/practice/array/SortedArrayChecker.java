package practice.array;

import java.util.Scanner;

public class SortedArrayChecker {

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
		
		if (isSorted(arr)) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}
	}
	
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
