package com.kodnest.multithreading.runnable;

public class ActivityApp2 {

	public static void main(String[] args) {
		Login2 login1 = new Login2();
		Print2 print1 = new Print2();
		Add2 add1 = new Add2();
		
		Thread t1 = new Thread(login1);
		Thread t2 = new Thread(print1);
		Thread t3 = new Thread(add1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
