package com.kodnest.multithreading.pcproblem;

public class Factory {

	int x;
	boolean dataPresent = false;
	
	synchronized void produceData(int i) {
		try {
			
			if (dataPresent == true) {
				wait();
			}
			
			x = i;
			System.out.println("Produced " + x + " in the factory");
//			Thread.sleep(2000);
			dataPresent = true;
			notify();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	synchronized void consumeData() {
		try {
			
			if (dataPresent == false) {
				wait();
			} 
			
			System.out.println("Consumed " + x + " from the factory");
			dataPresent = false;
			notify();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
