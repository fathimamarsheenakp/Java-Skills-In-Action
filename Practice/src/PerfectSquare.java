package com.kodnest.practice.revision;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		getSquare s = new getSquare();
		int res = s.Square(number);
		
		if (number == res) {
			System.out.println("NUmber is perfect square");
		} else {
			System.out.println("not perfect square");
		}

	}

}
