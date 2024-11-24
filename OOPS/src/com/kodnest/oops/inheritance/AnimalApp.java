package com.kodnest.oops.inheritance;

public class AnimalApp {

	public static void main(String[] args) {
		Lion lion = new Lion();
		System.out.println(lion.name + " " + lion.age);
		lion.eat();
		lion.sleep();

	}

}
