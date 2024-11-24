package com.kodnest.dsa.array;

import java.util.Scanner;

public class StudentArrayDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		Student[] arr = new Student[scanner.nextInt()];
		
		System.out.println("Enter id, name, gender and marks of " + arr.length + " students");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + ": ");
			arr[i] = new Student(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
		}
		
		System.out.println("Array contents are: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i].id + " " + arr[i].name + " " + arr[i].gender + " " + arr[i].marks);
			System.out.println();
		}
		
	}
}
