package com.kodnest.oops.inheritance;

public class BirddApp {

	public static void main(String[] args) {
		GoldenEagle goldenEagle = new GoldenEagle();
		
		System.out.println(goldenEagle.name + " " + goldenEagle.age);
		goldenEagle.fly();
		goldenEagle.eat();
		

	}

}
