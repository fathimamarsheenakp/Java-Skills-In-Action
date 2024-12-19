package com.kodnest.multithreading.thread;

public class Add2 extends Thread {
	
	@Override
	public void run() {
		add();
	}

	public void add() {
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
