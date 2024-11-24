package com.kodnest.looping;

public class LabelledFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deep: for (int i = 1; i <= 3; i++) {
			ran: for (int j = 1; j <= 3; j++) {
				if (j == 1) {
					System.out.println("Kodnest");
					break deep;
				}
			}
			System.out.println("-----------------------------------------------------------");
		}

	}

}
