package com.kodnest.multithreading.deadlock;

class DatabaseWorker extends Thread {
    private final Object firstTable;
    private final Object secondTable;

    // Constructor to initialize the resources and thread name
    public DatabaseWorker(Object firstTable, Object secondTable, String name) {
        super(name);
        this.firstTable = firstTable;
        this.secondTable = secondTable;
    }

    @Override
    public void run() {
        performTask();
    }

    // Separate method for the task
    private void performTask() {
        try {
            synchronized (firstTable) {
                System.out.println(Thread.currentThread().getName() + ": Locked " + firstTable);

                // Simulate some work
                System.out.println(Thread.currentThread().getName() + ": Waiting to lock " + secondTable);
                Thread.sleep(3000);

                synchronized (secondTable) {
                    System.out.println(Thread.currentThread().getName() + ": Locked " + secondTable);
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + ": Finished with " + secondTable + " and unlocking it");
                }

                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + ": Finished with " + firstTable + " and unlocking it");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}