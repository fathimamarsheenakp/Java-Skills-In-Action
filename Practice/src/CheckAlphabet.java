package com.kodnest.practice.revision;

public class CheckAlphabet {
	public void vowelOrConstants(char letter) {
		switch (letter) {
		case 'a' :
		case 'A':
		case 'e' :
		case 'E' :
		case 'i' :
		case 'I' :
		case 'O' :
		case 'o' :
		case 'U' :
		case 'u' :
			System.out.println("Vowel");
			break;
			
		default :
			System.out.println("Consonant");
			
		}
	}
}
