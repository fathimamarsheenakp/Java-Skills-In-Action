package com.kodnest.dsa.implementations;

import java.util.Scanner;

public class PayPalCircularQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Queue size: ");
		int size = scan.nextInt();
		CircularQueue circularQueue = new CircularQueue(size);
		
		while (true) {
			System.out.println(" Press 1 to enqueue \n Press 2 to dequeue \n Press 3 to display \n Press 4 to get an front element \n Press any number to exit");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter element to add");
				int element = scan.nextInt();
				circularQueue.enqueue(element);
				System.out.println();
				break;
				
			case 2:
				circularQueue.dequeue();
				System.out.println();
				break;
				
			case 3:
				circularQueue.display();
				System.out.println();
				break;
			
			case 4:
				circularQueue.peek();
				break;
				
			default:
				System.out.println("Thank You for using Circular Queue");
				System.exit(0);
			}
		}
	}
}
