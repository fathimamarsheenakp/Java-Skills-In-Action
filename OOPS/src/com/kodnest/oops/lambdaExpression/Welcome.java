package com.kodnest.oops.lambdaExpression;

public class Welcome {
	public static void main(String[] args) {
//		Greeting greeting = () -> {
//			System.out.println("Hello");
//		};
		Greeting greeting = (name) -> {
			System.out.println("Hello " + name);
		};
		greeting.greet("Adhitya");
	}
}
