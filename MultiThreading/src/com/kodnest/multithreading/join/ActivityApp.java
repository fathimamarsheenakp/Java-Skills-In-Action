package com.kodnest.multithreading.join;

import com.kodnest.multithreading.runnable.Activity;

public class ActivityApp {

	public static void main(String[] args) {
		System.out.println("---------------------RESOURCES ARE ALLOCATED---------------------");
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
		
		try {
			
			t1.join();
			t2.join();
			t3.join();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------RESOURCES ARE RELEASED---------------------");
	}
}
