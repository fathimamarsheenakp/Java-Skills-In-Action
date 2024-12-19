package com.kodnest.multithreading.racecondition;

public class MSWord implements Runnable {

	@Override
	public void run() {
		try {
		String name = Thread.currentThread().getName();
		if (name.equals("type")) {
			type();
		} else if (name.equals("spell")) {
			spellCheck();
		} else {
			autoSave();
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void type() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("Typing........................");
			Thread.sleep(2000);
		}
	}
	
	public void spellCheck() throws InterruptedException {
		for (;;) {
			System.out.println("spell checking..............");
			Thread.sleep(2000);
		}
	}
	
	public void autoSave() throws InterruptedException {
		for (;;) {
			System.out.println("Auto saving..............");
			Thread.sleep(2000);
		}
	}
}
