package com.kodnest.multithreading.intro;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Rama");
		t.setPriority(2);
		System.out.println(t);
	}
}
