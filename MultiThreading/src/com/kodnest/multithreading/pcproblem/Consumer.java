package com.kodnest.multithreading.pcproblem;

public class Consumer extends Thread {

	Factory ref;

	public Consumer(Factory ref) {
		this.ref = ref;
	}
	
	@Override
	public void run() {
		 while (true) {
			 ref.consumeData();
		 }
	}
}
