package com.kodnest.dsa.array;

public class GetMaxElement {

	int getMaxElement(int[] arr) {
		int max = arr[0];
		for(int i = 1; i <= arr.length -1; i++) {
			if (max < arr[i]) {
				max = arr[i];
//				System.out.println(max);
			}
		}
		return max;
	}
}
