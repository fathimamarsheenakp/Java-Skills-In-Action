package com.kodnest.dsa.mutablestrings;

public class StringCapacity {

	public static void main(String[] args) {
		
		System.out.println("============== STRING BUFFER ============================");
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		buffer.append("I am Fathima Marsheena K P ");
		System.out.println(buffer.capacity());
		buffer.append("From Malappuram, Kerala");
		System.out.println(buffer.capacity());
		
		System.out.println("============== STRING BUILDER ============================");
		StringBuilder builder = new StringBuilder();
		System.out.println(builder.capacity());
		builder.append("Sachin is a batsman");
		System.out.println(builder.capacity());
		builder.append("He lives in Mumbai");
		System.out.println(builder.capacity());
		
		
		System.out.println("------------------------------ SET CAPACITY INITIALLY -------------------------------------");
		System.out.println("============== STRING BUFFER ============================");
		StringBuffer buffer2 = new StringBuffer();
		buffer2.ensureCapacity(100);
		System.out.println(buffer2.capacity());
		
		System.out.println("============== STRING BUILDER ============================");
		StringBuilder builder2 = new StringBuilder(150);
		System.out.println(builder2.capacity());
		
	}

}
