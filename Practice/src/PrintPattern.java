package com.kodnest.practice.revision;

public class PrintPattern {
	void printRightAngledTriangleCharacterPattern (int numberOfRows) {
		for (int i = 1; i <= numberOfRows; i++) {
			for (int j = 1; j <= i;j ++) {
				System.out.print("A");
			}
			System.out.println();
		}
	}
	
//	void printRevertedRightAngledTriangleCharacterPattern (int numberOfRows) {
//		for (int i = 1; i <= numberOfRows; i++) {
//			for (int j = numberOfRows; j >= i; j--) {
//				System.out.print("A");
//			}
//			System.out.println();
//		}
//	}
}
