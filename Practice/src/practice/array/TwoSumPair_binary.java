package practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumPair_binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target");
		int target = sc.nextInt();
		
		System.out.println(twoSum(arr, target));
	}
	
	public static boolean twoSum(int[] arr, int target) {
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			int compliment = target - arr[i];
			if(binarySearch(arr, i + 1, arr.length - 1, compliment)) {
				return true;
			}
		} 
		return false;
	}
	
	public static boolean binarySearch(int[] arr, int left, int right, int target) {
		
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return true;
			} else if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}
	

}
