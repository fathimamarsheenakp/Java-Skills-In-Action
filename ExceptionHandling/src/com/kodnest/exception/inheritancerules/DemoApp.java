package com.kodnest.exception.inheritancerules;

public class DemoApp {

	public static void main(String[] args) {
		try {
			new Demo2().alpha();
		} catch (NegativeArraySizeException e) {
			System.out.println("OUR EXCEPTION");
			e.printStackTrace();
			System.out.println("OUR EXCEPTION");
		}
		
	}
}
