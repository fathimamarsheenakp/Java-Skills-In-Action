package com.kodnest.looping;

public class NestedDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; 
		do {
			int j = 1; 
			do {
				System.out.println("Kodnest");
				j++;
			} while (j <= 3);
			System.out.println("--------------------------------------------------------------");
			i++;
		} while (i <= 3);

	}

}
