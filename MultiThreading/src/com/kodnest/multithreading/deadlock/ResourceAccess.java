package com.kodnest.multithreading.deadlock;

public class ResourceAccess {

    // Resources representing database tables
    private static final Object orderTable = new Object();
    private static final Object paymentTable = new Object();

    public static void main(String[] args) {
        // Create two threads
        DatabaseWorker t1 = new DatabaseWorker(orderTable, paymentTable, "Myntra");
        DatabaseWorker t2 = new DatabaseWorker(paymentTable, orderTable, "Flipkart");

        // Start the threads
        t1.start();
        t2.start();
    }
}
