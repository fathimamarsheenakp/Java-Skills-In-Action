package com.kodnest.dsa.implementations;

import java.util.Scanner;

public class PayPalQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Queue size: ");
		int size = scan.nextInt();
		Queues queues = new Queues(size);
		
		while (true) {
			System.out.println(" Press 1 to enqueue \n Press 2 to dequeue \n Press 3 to display \n Press 4 to get an element \n Press any number to exit");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter element to add");
				int element = scan.nextInt();
				queues.enqueue(element);
				System.out.println();
				break;
				
			case 2:
				queues.dequeue();
				System.out.println();
				break;
				
			case 3:
				queues.display();
				System.out.println();
				break;
			
			case 4:
				System.out.println("Enter index to get element: ");
				int index = scan.nextInt();
				queues.getElement(index);
				break;
				
			default:
				System.out.println("Thank You for using queue");
				System.exit(0);
			}
		}
	}
}
