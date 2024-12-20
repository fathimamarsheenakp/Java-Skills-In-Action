package com.kodnest.multithreading.deadlock;

public class KurukshetraWar {

	public static void main(String[] args) {
		Warriors warriors = new Warriors();
		
		Thread t1 = new Thread(warriors);
		Thread t2 = new Thread(warriors);
		Thread t3 = new Thread(warriors);
		
		t1.setName("Arjuna");
		t2.setName("Karna");
		
		t1.start();
		t2.start();
	}
}
