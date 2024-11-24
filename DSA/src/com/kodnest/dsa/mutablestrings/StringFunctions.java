package com.kodnest.dsa.mutablestrings;

public class StringFunctions {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Kiran Roy");
		System.out.println(builder);
		System.out.println(builder.reverse());
		System.out.println(builder);
		
		System.out.println("======================================");
		String str = "Raja Ram Mohan Roy";
		StringBuffer buffer = new StringBuffer(str);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println("After reverse: " + buffer);
		System.out.println(str);
	}
}
