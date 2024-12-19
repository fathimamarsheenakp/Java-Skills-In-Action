package com.kodnest.multithreading.thread;

public class Add extends Thread {

	public void run() {
		try {
			System.out.println("ADDITION ACITIVITY STARTED");
			int a = 12548;
			int b = 21466;
			Thread.sleep(2000);
			long sum = a + b;
			System.out.println("ADDITION RESULT IS " + sum);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ADDITION ACITIVITY ENDED");
	}
}
