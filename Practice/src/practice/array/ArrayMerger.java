package practice.array;

import java.util.Scanner;

public class ArrayMerger {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter length of the Array-1: ");
		int[] arr1 = new int[scanner.nextInt()];
		System.out.println("Enter length of the Array-2: ");
		int[] arr2 = new int[scanner.nextInt()];

		
		System.out.println("Enter Array-1 elements: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter Array-2 elements: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			arr2[i] = scanner.nextInt();
		}
		
		System.out.println("Array-1 is: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("Array-2 is: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		int[] mergedArr = mergeSortedArrays(arr1, arr2);
		System.out.println("Merged Array is: ");
		for (int i = 0; i <= mergedArr.length - 1; i++) {
			System.out.print(mergedArr[i] + " ");
		}
	}
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] mergedArr = new int[length];
		for (int i = 0; i <= arr1.length - 1; i++) {
			mergedArr[i] = arr1[i];
		}
		
		for (int i = 0; i <= arr2.length - 1; i++) {
			mergedArr[arr1.length + i] = arr2[i];
		}
		return mergedArr;
	}

}
