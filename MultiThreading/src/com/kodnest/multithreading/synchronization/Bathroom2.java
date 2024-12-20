package com.kodnest.multithreading.synchronization;

public class Bathroom2 implements Runnable {

	@Override
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is entering bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is using bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is leaving bathroom");
			Thread.sleep(2000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
