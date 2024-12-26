package practice.array;

import java.util.HashSet;
import java.util.Scanner;

public class TwoSumPair_Hashing {

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
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			int compliment = target - arr[i];
			if (set.contains(compliment)) {
				return true;
			}
		}
		return false;
	}
}
