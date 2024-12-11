package com.kodnest.error.intro;

public class Demo {

	public static void main(String[] args) {
		Demo.greet();
	}
	
	public static void greet() {
		try {
			System.out.println("Hello");
			greet();
		} catch (Error e) {
			System.out.println("StackOverFlowError...Seriosly this is your logic?....Give stopping condition...");
		}
	}
}
