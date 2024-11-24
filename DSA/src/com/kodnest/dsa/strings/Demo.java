package com.kodnest.dsa.strings;

public class Demo {

	public static void main(String[] args) {
		String str1 = new String("Omkar");
		String str2 = new String("Omkar");
		
		if (str1 == str2) {
			System.out.println("References are EQUAL for string  created using new");
		} else {
			System.out.println("References are NOT EQUAL for string  created using new");
		}
		
		if (str1.equals(str2)) {
			System.out.println("Values are EQUAL for string  created using new");
		} else {
			System.out.println("Values are NOT EQUAL for string  created using new");
		}
		
		String str3 = "Kiran";
		String str4 = "Kiran";
		
		
//		COMPARE THE REFERENCES
		if (str3 == str4) {
			System.out.println("References are EQUAL for string created without using new");
		} else {
			System.out.println("References are NOT EQUAL for string created without using new");
		}
		
		
//		COMPARE THE VALUES
		if (str3.equals(str4)) {
			System.out.println("Values are EQUAL for string  created without using new");
		} else {
			System.out.println("Values are NOT EQUAL for string  created without using new");
		}
		
		System.out.println("============================================================");
		
		String str5 = "KodNest";
		String str6 = "Kodnest";
		String str7 = new String("Kodnest");
		
//		if (str5 == str6) {
//			System.out.println("Values in the string are EQUAL by ignoring cases");
//		} else {
//			System.out.println("Values in the string are NOT EQUAL by ignoring cases");
//		}
		
		if (str5.equals(str6)) {
			System.out.println("Values in the string are EQUAL");
		} else {
			System.out.println("Values in the string are NOT EQUAL");
		}
		
		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("Values in the string are EQUAL by ignoring cases");
		} else {
			System.out.println("Values in the string are NOT EQUAL by ignoring cases");
		}
		
		if (str5.equalsIgnoreCase(str7)) {
			System.out.println("Values in the string are EQUAL created using new  by ignoring cases");
		} else {
			System.out.println("Values in the string are NOT EQUAL created without using new by ignoring cases");
		}
		
	}
}
