package com.kodnest.dsa.mutablestrings;

public class MutableDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rama");
		System.out.println(sb);
		sb.append("Sita");
		System.out.println(sb);
		System.out.println("=======================================");
		
		StringBuilder builder = new StringBuilder("Kodnest");
		System.out.println(builder);
		builder.append("TECH");
		System.out.println(builder);
	}

}
