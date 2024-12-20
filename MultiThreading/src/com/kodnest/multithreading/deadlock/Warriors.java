package com.kodnest.multithreading.deadlock;

public class Warriors implements Runnable {
	
	String asthra1 = new String("SARPASTHRA");
	String asthra2 = new String("GARUDASTHRA");
	String asthra3 = new String("PASHUPASTHRA");

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("Arjuna")) {
			arjunaAquireResource();
		} else {
			karnaAquireResource();
		}
	}
	
	public void arjunaAquireResource() {
		try {
			Thread.sleep(2000);
			synchronized (asthra1) {
				System.out.println(Thread.currentThread().getName() + " has aquired " + asthra1);
				Thread.sleep(2000);
				synchronized (asthra2) {
					System.out.println(Thread.currentThread().getName() + " has aquired " + asthra2);
					Thread.sleep(2000);
					synchronized (asthra3) {
						System.out.println(Thread.currentThread().getName() + " has aquired " + asthra3);
						Thread.sleep(2000);
					}
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void karnaAquireResource() {
		try {
			Thread.sleep(2000);
			synchronized (asthra1) {
				System.out.println(Thread.currentThread().getName() + " has aquired " + asthra1);
				Thread.sleep(2000);
				synchronized (asthra2) {
					System.out.println(Thread.currentThread().getName() + " has aquired " + asthra2);
					Thread.sleep(2000);
					synchronized (asthra3) {
						System.out.println(Thread.currentThread().getName() + " has aquired " + asthra3);
						Thread.sleep(2000);
					}
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
