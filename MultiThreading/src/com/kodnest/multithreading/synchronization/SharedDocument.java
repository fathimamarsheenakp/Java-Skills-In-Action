package com.kodnest.multithreading.synchronization;

public class SharedDocument {

    private String content = ""; // Initialize content

    // Synchronized method to edit content
    public synchronized void editContent(String newText) {
        content += newText; // Append new text to the content
        System.out.println(Thread.currentThread().getName() + " edited content.");
    }

    // Synchronized method to read content
    public synchronized String readContent() {
        System.out.println(Thread.currentThread().getName() + " read content.");
        return content; // Return the current content
    }

    public static void main(String[] args) {
        SharedDocument document = new SharedDocument();

        // Thread 1: Writing to the document
        Thread writer1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                document.editContent("Writer1 ");
                try {
                    Thread.sleep(2000); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Writer1-Thread");

        // Thread 2: Writing to the document
        Thread writer2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                document.editContent("Writer2 ");
                try {
                    Thread.sleep(2000); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Writer2-Thread");

        // Thread 3: Reading the document
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Reader read: " + document.readContent());
                try {
                    Thread.sleep(150); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Reader-Thread");

        // Start the threads
        writer1.start();
        writer2.start();
        reader.start();

        // Wait for threads to finish
        try {
            writer1.join();
            writer2.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final content
        System.out.println("Final Content: " + document.readContent());
    }
}

