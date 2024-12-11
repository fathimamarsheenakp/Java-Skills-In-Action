package com.kodnest.exception.propogation;

public class DemoApp {

	public static void main(String[] args) {
		try {
			new Demo1().call1();
		} catch (Exception e) {
			System.out.println("Some exception occured");
		}
		
	}
}
