package com.kodnest.dsa.implementations;

import java.util.Scanner;

public class PayPalDLinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList dList = new DoublyLinkedList();
		
		while (true) {
			System.out.println(" Press 1 to Insert at End \n Press 2 to Insert at Front \n Press 3 to Delete from Rear \n Press 4 to Delete from Front \n Press 5 to display from forward \n Press 6 to display reverse \n Press any number to exit");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter element to add");
				int element = scan.nextInt();
				dList.insertAtRear(element);
				System.out.println();
				break;
				
			case 2:
				System.out.println("Enter element to add");
				int element1 = scan.nextInt();
				dList.insertAtFront(element1);
				System.out.println();
				break;
				
			case 3:
				dList.deleteFromRear();
				System.out.println();
				break;
			
			case 4:
				dList.deleteFromFront();
				System.out.println();
				break;
			
			case 5:
				dList.displayForward();
				System.out.println();
				break;
				
			case 6:
				dList.displayReverse();
				System.out.println();
				break;
				
			default:
				System.out.println("Thank You for using Doubly Linked List");
				System.exit(0);
			}
		}
	}
}
