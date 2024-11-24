package com.kodnest.practice.revision;

import java.util.Scanner;

public class CheckPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
//		System.out.println("===================================================");
		
		PrintPattern print = new PrintPattern();
		print.printRightAngledTriangleCharacterPattern(numberOfRows);
//		System.out.println("===================================================");

//		print.printRevertedRightAngledTriangleCharacterPattern(numberOfRows);
//		System.out.println("===================================================");
		
		System.out.println("------------------------- END OF PATTERN -----------------------------");

	}

}
