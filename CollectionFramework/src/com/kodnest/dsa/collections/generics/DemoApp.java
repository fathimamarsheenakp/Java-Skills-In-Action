package com.kodnest.dsa.collections.generics;

public class DemoApp {

	public static void main(String[] args) {
		Demo<Integer> demo = new Demo<Integer>();
		
		demo.set(100);
		demo.display();
		
		Demo<String> demo2 = new Demo<String>();
		demo2.set("RAM");
		demo2.display();
		
		Demo<Boolean> demo3 = new Demo<Boolean>();
		demo3.set(false);
		demo3.display();
		
		demo3.sampling("Hello");
		demo2.sampling("Roll No: ");
		demo.sampling(15);
	}
}
