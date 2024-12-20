package com.kodnest.multithreading.synchronization;

public class SynchronizationDemo2 {

	public static void main(String[] args) {
		Bathroom2 bathroom = new Bathroom2();
		
		Thread t1 = new Thread(bathroom);
		Thread t2 = new Thread(bathroom);
		Thread t3 = new Thread(bathroom);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHER");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
