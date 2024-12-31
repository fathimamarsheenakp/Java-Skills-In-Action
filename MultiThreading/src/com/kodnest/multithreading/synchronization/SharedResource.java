package com.kodnest.multithreading.synchronization;

class SharedResource {
	
    public synchronized void display(String message) {
        System.out.print("[");
        System.out.print(message);
        System.out.println("]");
    }
}
