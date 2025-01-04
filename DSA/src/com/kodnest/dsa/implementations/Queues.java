package com.kodnest.dsa.implementations;

public class Queues {
    private int size;
    private int[] queue;
    private int front;
    private int rear;

    public Queues(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
        System.out.println("Queue of size " + size + " created successfully!");
    }

    public void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("Queue is full! Insertion not possible.");
        } else {
            if (front == -1) {
                front = 0; 
            }
            rear++;
            queue[rear] = element;
            System.out.println("Element " + element + " added to the queue.");
        }
    }

    
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty! Deletion not possible.");
        } else {
            System.out.println(queue[front] + " deleted from the queue.");
            queue[front] = 0; 
            front++;
        }
    }

    public void getElement(int index) {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
        } else if (index < front || index > rear) {
            System.out.println("Enter index between " + front + " and " + rear + ".");
        } else {
            System.out.println("Element at index " + index + ": " + queue[index]);
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty! Nothing to display.");
        } else {
            System.out.print("Queue is: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}
