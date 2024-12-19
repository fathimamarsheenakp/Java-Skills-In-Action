package com.kodnest.multithreading.thread;

public class ActivityApp {

	public static void main(String[] args) {
		Login t1 = new Login();
		Print t3 = new Print();
		Add t2 = new Add();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
