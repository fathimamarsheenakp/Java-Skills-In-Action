package practice.array;

import java.util.Scanner;

public class LargestElementFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array: ");
		int length = scanner.nextInt();
		
		int[] arr = new int[length];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Array is: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("Largest element in the array is: " + findLargestElement(arr));
		
	}
	
	static int findLargestElement(int[] array) {
		int max = array[0];
		for (int i = 1; i <= array.length - 1; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
