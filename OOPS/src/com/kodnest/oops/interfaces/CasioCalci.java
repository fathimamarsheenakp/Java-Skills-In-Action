package com.kodnest.oops.interfaces;

public class CasioCalci implements Calculator {

	@Override
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	@Override
	public void sub() {
		int a = 20;
		int b = 10;
		System.out.println(a - b);
		
	}

}
