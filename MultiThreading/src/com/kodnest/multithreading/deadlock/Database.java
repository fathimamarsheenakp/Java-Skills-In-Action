package com.kodnest.multithreading.deadlock;

public class Database {
    // Resources representing database tables
    private static final Object table1 = new Object();
    private static final Object table2 = new Object();

    public static void main(String[] args) {
        // Thread 1: Tries to update Table1, then Table2
        Thread thread1 = new Thread(() -> {
        	try {
	            synchronized (table1) {
	                System.out.println("Thread 1: Locked Table1");
	                
	                System.out.println("Thread 1: Waiting to lock Table2");
	                Thread.sleep(3000);
	                synchronized (table2) {
	                    System.out.println("Thread 1: Locked Table2");
	                    Thread.sleep(3000);
	                    System.out.println("Thread 1: Finished with Table2 and unlocking Table2");
	                }
	                Thread.sleep(3000);
	                System.out.println("Thread 1: Finished with Table1 and unlocking Table1");
	            }
        	} catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread 2: Tries to update Table2, then Table1
        Thread thread2 = new Thread(() -> {
        	try {
	            synchronized (table1) {
	                System.out.println("Thread 2: Locked Table1");
	                
	                System.out.println("Thread 2: Waiting to lock Table2");
	                Thread.sleep(3000);
	                synchronized (table2) {
	                	System.out.println("Thread 2: Locked Table2");
	                	Thread.sleep(3000);
	                	System.out.println("Thread 2: Finished with Table2 and unlocking Table2");
	                }
	                Thread.sleep(3000);
	                System.out.println("Thread 2: Finished with Table1 and unlocking Table1");
	            
	            }
        	}catch (Exception e) {
        		e.printStackTrace();
        	}
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

