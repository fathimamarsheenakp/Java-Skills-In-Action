package com.kodnest.looping;

public class NestedWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; 
		while (i <= 3){
			int j = 1; 
			while (j <= 3) {
				System.out.println("Kodnest");
				j++;
			}
			System.out.println("--------------------------------------------------------------");
			i++;
		}
	}

}
