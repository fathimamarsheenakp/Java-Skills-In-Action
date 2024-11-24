package com.kodnest.dsa.strings;

public class DemoConcate {

	public static void main(String[] args) {
		String str1 = "Kodnest";
		System.out.println(str1);
		
		str1.concat("Tech");
		System.out.println(str1);
		
		String str2 = str1.concat("Tech");
		System.out.println(str2);
		
		str1 = str1.concat("Tech");
		System.out.println(str1);
	}
}
