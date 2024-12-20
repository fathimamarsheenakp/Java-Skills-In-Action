package com.kodnest.multithreading.synchronization;

public class SynchronizationDemo {

    public static void main(String[] args) {
    	Bathroom bathroom = new Bathroom();
    	
    	Thread t1 = new Thread(bathroom, "BOY");
        Thread t2 = new Thread(bathroom, "GIRL");
        Thread t3 = new Thread(bathroom, "OTHER");

        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("OTHER");

        t1.start();
        t2.start();
        t3.start();
    }
}
