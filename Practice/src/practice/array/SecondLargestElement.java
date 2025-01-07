package practice.array;

import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > largest) {
				secondLargest = largest;
				largest = i;
			} else {
				if (i > secondLargest && i != largest) {
					secondLargest = i;
				}
			}
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element");
		} else {
			System.out.println("Second largest element is " + secondLargest);
		}
	}
}
