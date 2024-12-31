package com.kodnest.multithreading.yield;

class Demo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);

            // Hint to the scheduler to yield
            Thread.yield();
        }
    }

    public static void main(String[] args) {
    	Demo thread1 = new Demo();
    	Demo thread2 = new Demo();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();
    }
}

