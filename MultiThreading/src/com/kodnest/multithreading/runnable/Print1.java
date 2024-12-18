package com.kodnest.multithreading.runnable;

public class Print1 implements Runnable {

	@Override
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
