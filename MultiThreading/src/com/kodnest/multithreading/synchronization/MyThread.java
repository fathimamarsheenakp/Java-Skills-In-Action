package com.kodnest.multithreading.synchronization;

class MyThread extends Thread {
    SharedResource resource;
    String message;

    MyThread(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    public void run() {
        resource.display(message);
    }
}