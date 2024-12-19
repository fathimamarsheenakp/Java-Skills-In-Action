package com.kodnest.multithreading.thread;

public class AcitivityApp2 {

	public static void main(String[] args) {
		Login2 t1 = new Login2();
		Print2 t3 = new Print2();
		Add2 t2 = new Add2();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
