package com.kodnest.dsa.implementations;

import java.util.Scanner;

public class PayPalStack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Stack size: ");
		int size = scan.nextInt();
		Stacks stacks = new Stacks(size);
		
		while (true) {
			System.out.println(" Press 1 to push element \n Press 2 to pop element \n Press 3 to display \n Press 4 to get an element \n Press any number to exit");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter element to push");
				int element = scan.nextInt();
				stacks.push(element);
				System.out.println();
				break;
				
			case 2:
				stacks.pop();
				System.out.println();
				break;
				
			case 3:
				stacks.display();
				System.out.println();
				break;
			
			case 4:
				System.out.println("Enter index to get element: ");
				int index = scan.nextInt();
				stacks.getElement(index);
				break;
				
			default:
				System.out.println("Thank You for using Stack");
				System.exit(0);
			}
		}
	}
}
