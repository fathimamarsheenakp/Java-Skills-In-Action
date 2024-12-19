package com.kodnest.multithreading.interrupt;

public class InterruptApp {

	public static void main(String[] args) {
		try {
			Task task = new Task();
			Thread taskThread = new Thread(task);
			taskThread.start();
			Thread.currentThread().sleep(2000);
			taskThread.interrupt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
