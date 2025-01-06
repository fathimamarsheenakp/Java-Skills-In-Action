package com.kodnest.annotations.inbuildannotations;

import java.util.ArrayList;

public class Demo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int a = 10;
		Demo2 d2 = new Demo2();
		d2.sample();
		d2.greet();
		
		@SuppressWarnings({"rawtypes", "unused"})
		ArrayList al = new ArrayList();
	}
}
