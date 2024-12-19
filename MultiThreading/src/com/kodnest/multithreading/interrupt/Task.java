package com.kodnest.multithreading.interrupt;

public class Task implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("KODNEST");
			try {
				Thread.sleep(2000);
			}catch (Exception e) {
				System.out.println("Thread dead");
				e.printStackTrace();
			}
		}
	}

}
