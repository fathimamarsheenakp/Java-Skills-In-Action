package com.kodnest.dsa.searchingalgo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array");
        // Ask user for input array
        String[] input = scanner.nextLine().split("\\s+");
        int[] arr = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        // Find the minimum element using Binary Search
        int minElement = findMin(arr);
        // Print the minimum element
        System.out.println("The minimum element is " + minElement + ".");
        scanner.close();
    }

    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        // If the array is not rotated
        if(arr[left] <= arr[right]) {
            return arr[left];
        }
        while(left <= right) {
            int mid = (right + left) / 2;
            // Check if mid element is minimum
            if(mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            // Check if mid+1 element is minimum
            if(mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            // Decide which side to go
            if(arr[mid] >= arr[left]) {
                // Left part is sorted, pivot is in right part
                left = mid + 1;
            } else {
                // Right part is sorted, pivot is in left part
                right = mid - 1;
            }
        }
        return arr[0]; // Fallback
    }
}
