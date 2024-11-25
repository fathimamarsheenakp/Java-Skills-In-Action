package com.kodnest.dsa.implementations;

import java.util.Scanner;

public class PayPalArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int size = scan.nextInt();
		Arrays arrays = new Arrays(size);
		
		while (true) {
			System.out.println(" Press 1 to insert \n Press 2 to delete \n Press 3 to display \n Press 4 to gen an element \n Press any number to exit");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter element and position to insert");
				int element = scan.nextInt();
				int position = scan.nextInt();
				arrays.insert(position, element);
				System.out.println();
				break;
				
			case 2:
				System.out.println("Enter position to delete");
				int position1 = scan.nextInt();
				arrays.delete(position1);
				System.out.println();
				break;
				
			case 3:
				arrays.display();
				System.out.println();
				break;
			
			case 4:
				System.out.println("Enter index to get element: ");
				int index = scan.nextInt();
				arrays.getElement(index);
				System.out.println();
				break;
			default:
				System.out.println("Thank You for using Array");
				System.exit(0);
			}
		}
	}

}
