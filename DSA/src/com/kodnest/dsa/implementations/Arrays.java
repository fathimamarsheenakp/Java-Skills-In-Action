package com.kodnest.dsa.implementations;

public class Arrays {

	private int arr[];
	private int size;
	
	public Arrays(int size) {
		this.size = size;
		arr = new int[size];
		System.out.println("Array of size " + size + " got created.");
		System.out.println();
	}
	
	public void insert(int pos, int element) {
		if (pos >= 0 && pos < arr.length) {
			arr[pos] = element;
		} else {
			System.out.println("Enter position between 0 and " + (arr.length - 1));
		}
		
	}
	
	public void delete(int pos) {
		if (pos >= 0 && pos < arr.length) {
			arr[pos] = 0;
		} else {
			System.out.println("Enter position between 0 and " + (arr.length - 1));
		}
		
	}
	
	public void display() {
		System.out.print("Array elemets are: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void getElement(int index) {
		if (index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		} else {
			System.out.println("Enter position between 0 and " + (arr.length - 1));
		}
	}
}
