package com.kodnest.multithreading.synchronization;

class BankAccount {
    private int balance = 0; // Shared resource

    // Synchronized method to deposit money
    public synchronized void deposit(int amount) {
    	try {
        int newBalance = balance + amount; // Read and update balance
        System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
        
            Thread.sleep(2000); // Simulate delay
        
        balance = newBalance; // Update balance
        System.out.println(Thread.currentThread().getName() + " updated balance to " + balance);
        Thread.sleep(2000);
    	} catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    // Synchronized method to get balance
    public synchronized int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Shared BankAccount object

        // Thread 1: Deposit 100
        Thread person1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(100);
            }
        }, "Person1");

        // Thread 2: Deposit 200
        Thread person2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(200);
            }
        }, "Person2");

        // Thread 3: Deposit 300
        Thread person3 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300);
            }
        }, "Person3");
        
//     // Thread 1: Deposit 100
//        Thread person1 = new Thread(() -> account.deposit(100), "Person1");
//
//        // Thread 2: Deposit 200
//        Thread person2 = new Thread(() -> account.deposit(200), "Person2");
//
//        // Thread 3: Deposit 300
//        Thread person3 = new Thread(() -> account.deposit(300), "Person3");

        // Start all threads
        person1.start();
        person2.start();
        person3.start();

        // Wait for threads to finish
        try {
            person1.join();
            person2.join();
            person3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}

