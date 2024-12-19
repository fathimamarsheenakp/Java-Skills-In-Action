package com.kodnest.multithreading.thread;

public class ActivityApp3 {

	public static void main(String[] args) {
		Activity t1 = new Activity();
		Activity t2 = new Activity();
		Activity t3 = new Activity();
		
		t1.setName("login");
		t2.setName("print");
		t3.setName("add");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
