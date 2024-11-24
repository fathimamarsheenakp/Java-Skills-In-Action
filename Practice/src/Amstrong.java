package com.kodnest.practice.revision;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		AmstrongNumber a = new AmstrongNumber();
		boolean res = a.checkAmstrong(number);
		if (res == true) {
			System.out.println(number + " is Armstrong");
		} else {
			System.out.println(number + " is not Armstrong");
		}

	}

}
