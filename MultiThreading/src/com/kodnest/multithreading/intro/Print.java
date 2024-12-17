package com.kodnest.multithreading.intro;

public class Print {

	void doActivity() {
		try {
			System.out.println("PRINTING ACTIVITY STARTED");
			for (int i = 0; i < 5; i++) {
				System.out.println("KODNEST");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PRINTING ACTIVITY STARTED");
	}
}
