package com.kodnest.dsa.sortingalgo;

public class QuickSortLearn {

    // Method to sort an array using Quicksort
    public static void quickSort(int[] arr, int low, int high) {
    	System.out.println("--------------- Quicksort start ----------------------------");
    	System.out.println("low = " + low);
    	System.out.println("high = " + high);
    	System.out.println("CHECK CONDITION");
        if (low < high) {
            // Partition the array and get the pivot index
        	System.out.println("CONDITION TRUE");
            int pivotIndex = partition(arr, low, high);
            System.out.println("pivotIndex = " + pivotIndex);

            // Recursively sort elements before and after the partition
            quickSort(arr, low, pivotIndex - 1);  // Left sub-array
            System.out.println("#### Left sub-array done ####");
            quickSort(arr, pivotIndex + 1, high);  // Right sub-array
            System.out.println("#### Right sub-array done ####");
        }
        System.out.println("------------------ Quickstart End --------------------------");
    }

    // Partition method
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot element
        int i = low - 1;  // Pointer for smaller element
        System.out.println("------------- partition start ---------------------------");
        System.out.println("pivot element = " + pivot);
        System.out.println("i = " + i);

        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
        	
            if (arr[j] < pivot) {
            	System.out.println(arr[j] + " < " +  pivot);
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                System.out.print("Array is : ");
                for (int k : arr) {
					System.out.print(k + " ");
				}
                System.out.println();
            }
        }
        System.out.println("After for, i = " + i);

        // Place the pivot element in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        System.out.print("		Array is : ");
        for (int k : arr) {
			System.out.print(k + " ");
		}
        System.out.println();
        
        System.out.println("-------------------- partition end --------------------------");
        return i + 1;  // Return the pivot index
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("Unsorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array using QuickSort
        quickSort(array, 0, n - 1);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

