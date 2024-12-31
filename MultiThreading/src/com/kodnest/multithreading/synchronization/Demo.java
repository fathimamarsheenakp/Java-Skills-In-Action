package com.kodnest.multithreading.synchronization;

public class Demo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        
        MyThread t1 = new MyThread(resource, "Hello");
        MyThread t2 = new MyThread(resource, "World");

        t1.start();
        t2.start();
    }
}
