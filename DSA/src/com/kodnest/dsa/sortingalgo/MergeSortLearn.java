package com.kodnest.dsa.sortingalgo;

import java.util.Arrays;

public class MergeSortLearn {
    // Method to sort an array using merge sort
    public static void mergeSort(int[] array, int left, int right) {
    	System.out.println("------------mergeSort start---------------------");
    	System.out.println("Left : " + left);
        System.out.println("Right : " + right);
        System.out.println("CHECK");
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;
            System.out.println("........TRUE.........");
            System.out.println("Middle : " + middle);
            System.out.println();

            // Recursively sort the first and second halves
            mergeSort(array, left, middle);
            System.out.println("=======next========");
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            System.out.println("-----------------------------");
            merge(array, left, middle, right);
        }
    	System.out.println("------------mergeSort end---------------------");
    }

    // Method to merge two sorted subarrays
    public static void merge(int[] array, int left, int middle, int right) {
        System.out.println("----------------------------- merge start ---------------");
    	System.out.println("Left : " + left);
        System.out.println("Right : " + right);
        System.out.println("Middle : " + middle);
        
        // Sizes of the two subarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;
        System.out.println("n1 -> " + n1);
        System.out.println("n2 -> " + n2);

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        System.out.print("Left Array: ");
        for (int i : leftArray) {
			System.out.print(i + " ");
		}
        System.out.println();
        
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }
        System.out.print("Right Array: ");
        for (int i : rightArray) {
			System.out.print(i + " ");
		}
        System.out.println();

        // Merge the temporary arrays back into the originals array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
        System.out.print("Array is ");
        for (int a : array) {
			System.out.print(a + " ");
		}
        System.out.println();
        System.out.println("----------------------------- merge end ---------------");

    }

    // Main method to test the merge sort implementation
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Perform merge sort
        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}

