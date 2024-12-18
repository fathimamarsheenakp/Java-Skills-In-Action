package com.kodnest.multithreading.runnable;

public class ActivityApp3 {

	public static void main(String[] args) {
		Activity activity = new Activity();
		
		Thread t1 = new Thread(activity);
		Thread t2 = new Thread(activity);
		Thread t3 = new Thread(activity);
		
		t1.setName("login");
		t2.setName("print");
		t3.setName("add");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
