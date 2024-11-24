package practice.array;

import java.util.Scanner;

public class ArrayReverser {

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
		reverseArray(arr);
	}
	
	public static void reverseArray(int[] arr) {
		int[] reversedArr = new int[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i <= arr.length - 1; i++) {
			reversedArr[j] = arr[i];
			j--;
		}
		
		System.out.println("Reversed Array is: ");
		for (int i = 0; i <= reversedArr.length - 1; i++) {
			System.out.print(reversedArr[i] + " ");
		}
		System.out.println();
	}
}
