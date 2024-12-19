package com.kodnest.multithreading.thread;

public class Print extends Thread {

	public void run() {
		try {
			System.out.println("PRINTING ACTIVITY STARTED");
			for (int i = 0; i < 5; i++) {
				System.out.println("KODNEST");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PRINTING ACTIVITY ENDED");
	}
}
