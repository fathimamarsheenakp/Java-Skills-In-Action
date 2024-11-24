package com.kodnest.dsa.searchingalgo;

import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the array
        System.out.println("Enter the elements of the array, separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Step 2: Input the number of subarrays (k)
        System.out.println("Enter the number of subarrays (k):");
        int k = scanner.nextInt();

        // Step 3: Find and print the minimized largest sum
        int minimizedLargestSum = splitArray(arr, k);
        System.out.println("The minimized largest sum is " + minimizedLargestSum + ".");

        scanner.close();
    }

    // Binary Search Logic
    public static int splitArray(int[] nums, int k) {
        int maxElement = 0;
        int totalSum = 0;

        // Find the maximum element and the total sum of the array
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            totalSum += num;
        }

        // Binary search range
        int low = maxElement;
        int high = totalSum;
        int result = totalSum;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (canSplit(nums, k, mid)) {
                result = mid; // Update result with a feasible value
                high = mid - 1; // Try for a smaller maximum sum
            } else {
                low = mid + 1; // Try for a larger maximum sum
            }
        }

        return result;
    }

    // Helper method to check if the array can be split into k subarrays with max sum <= maxSum
    public static boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrayCount = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrayCount++; // Start a new subarray
                currentSum = num;

                if (subarrayCount > k) {
                    return false; // Exceeds the allowed number of subarrays
                }
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}

