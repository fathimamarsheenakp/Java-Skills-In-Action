package com.kodnest.multithreading.runnable;

public class AcitivityApp1 {

	public static void main(String[] args) {
		Login1 login1 = new Login1();
		Print1 print1 = new Print1();
		Add1 add1 = new Add1();
		
		Thread t1 = new Thread(login1);
		Thread t2 = new Thread(print1);
		Thread t3 = new Thread(add1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
