package com.kodnest.practice.revision;

import java.util.Scanner;

public class CheckAlphabetManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = sc.next().charAt(0);
		CheckAlphabet c = new CheckAlphabet();
		c.vowelOrConstants(letter);
		

	}

}
