package com.kodnest.multithreading.synchronization;

public class Bathroom extends Thread {

    synchronized public void useBathroom() {
        try {
            System.out.println(Thread.currentThread().getName() + " is entering bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is using bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is leaving bathroom");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
    	useBathroom();
    }
}

