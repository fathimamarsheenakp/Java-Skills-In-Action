package com.kodnest.annotations.inbuildannotations;

public class Demo1 {
	void sample() {
		System.out.println("Hello sample");
	}
	
	@Deprecated
	void greet() {
		System.out.println("Hello");
	}
	
	void betterGreet() {
		System.out.println("Hello user");
	}
}
