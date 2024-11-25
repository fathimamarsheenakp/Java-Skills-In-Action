package com.kodnest.dsa.implementations;

public class Queues {
	private int size = 0;
	private int[] queue = null;
	private int front = -1;
	private int rear = -1;
	
	public Queues(int size) {
		this.size = size;
		queue = new int[size];
		System.out.println("Queue of size " + size + " created successfully!");
	}
	
	public void enqueue(int element) {
		if (rear == size - 1) {
			System.out.println("Queue is full!. Insertion not possible");
		} else {
			++rear;
			queue[rear] = element;
			System.out.println("Element " + element + " added to the queue");
		}
	}
	
	public void dequeue() {
		if (rear == -1) {
			System.out.println("Queue is empty!. Deletion not possible");
		} else {
			++front;
			System.out.println(queue[front] + " deleted from the queue");
			queue[front] = 0;
			++front;
		}
	}
	
	public void getElement(int index) {
		if (rear == -1 || front == size - 1) {
			System.out.println("Queue is empty!.");
		} else if (index < front || index > rear){
			System.out.println("Enter index between " + front + " and " + rear);
		} else {
			System.out.println("Element at index " + index + ": " + queue[index]);
		}
	}
	
	public void display() {
		if (rear == -1 || front == size - 1) {
			System.out.println("Queue is empty!. Nothing to display");
		} else {
			System.out.print("Queue is: ");
			for (int i = 0; i <= rear; i++) {
				System.out.print(queue[i] + " ");
			}
		}
	}
}
