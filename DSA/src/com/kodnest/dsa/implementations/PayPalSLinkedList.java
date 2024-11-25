package com.kodnest.dsa.implementations;

import java.util.Scanner;

public class PayPalSLinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList single = new SinglyLinkedList();
		
		while (true) {
			System.out.println(" Press 1 to Insert at End \n Press 2 to Insert at Front \n Press 3 to Delete from Rear \n Press 4 to Delete from Front \n Press 5 to display \n Press any number to exit");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter element to add");
				int element = scan.nextInt();
				single.insertRear(element);
				System.out.println();
				break;
				
			case 2:
				System.out.println("Enter element to add");
				int element1 = scan.nextInt();
				single.insertFront(element1);
				System.out.println();
				break;
				
			case 3:
				single.deleteRear();
				System.out.println();
				break;
			
			case 4:
				single.deleteFront();
				System.out.println();
				break;
			
			case 5:
				single.display();
				System.out.println();
				break;
				
			default:
				System.out.println("Thank You for using Singly Linked List");
				System.exit(0);
			}
		}
	}
}
