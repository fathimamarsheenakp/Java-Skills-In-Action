package com.kodnest.practice.revision;

public class BinaryofDecimal {
	String getBinary(int n) {
		String binary = "";
		while (n != 0) {
			int rem = n % 2;
			binary = rem + binary;
			n = n / 2;
		}
//		String resBinary = getReverse(binary);
		return binary;
	}
	
// 100	

//	static String getReverse(String binary) {
//		int n = binary.length();
//		String revBinary = "";
//		for (int i = n-1; i >= 0; i--) {
//			revBinary = revBinary + binary.charAt(i);
//		}
//		return revBinary;
//	}
}
