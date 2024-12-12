package com.kodnest.exception.customeException;

import java.util.Scanner;

public class ATM {

	String pin = "1111";
	void withDraw() throws InvalidPinException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		String uPin = sc.next();
		if (pin.equals(uPin)) {
			System.out.println("TAKE ALL THE MONEY IN ATM");
		} else {
			InvalidPinException ipe = new InvalidPinException();
			System.out.println(ipe.getMessage());
			throw ipe;
		}
	}
	
}
