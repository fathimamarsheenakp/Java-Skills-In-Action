package com.kodnest.dsa.searchingalgo;

import java.util.*;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the array elements (space-separated): ");
        String[] input = scanner.nextLine().split("\\s");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        
        // Find and print the duplicate number
        int duplicate = findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);
        
        scanner.close();
    }

    public static int findDuplicate(int[] arr) {
    	int left = 1;
    	int right = arr.length - 1;
    	
    	while (left <= right) {
    		int mid = (left + right) / 2;
    		int count = 0;
    		
    		for (int i : arr) {
				if (i <= mid) {
					count++;
				}
			}
    		
    		if (count > mid) {
    			right = mid - 1;
    		} else {
    			left = mid + 1;
    		}
    	}
    	return left;
    }
}

