package com.kodnest.dsa.implementations;

public class CircularQueue {
	private int size = 0;
	private int[] cqueue = null;
	private int front = -1;
	private int rear = -1;
	
	public CircularQueue(int size) {
		this.size = size;
		cqueue = new int[size];
		System.out.println("Circular Queue of size " + size + " created successfully!");
	}
	
	public boolean isFull() {
		return (rear + 1) % size == front;
	}
	
	public boolean isEmpty() {
		return front == -1;
	}
	
	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Circular queue is full");
			return;
		}
		
		if (front == -1) {
			front = 0;
		} 
		
		rear = (rear + 1) % size;
		cqueue[rear] = element;
		System.out.println("Element " + element + " added to the circular queue");
	}
	
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return;
		}
		
		System.out.println("Element " + cqueue[front] + " removed from the cicrular queue");
		if (front == rear) {
			front = rear = -1;
		} else {
			front = (front + 1) % size;
		}
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return;
		}
		
		int i = front;
		while (true) {
			System.out.print(cqueue[i] + " ");
			if (rear == i) {
				break;
			}
			i = (i + 1) % size;
		}
	}
	
	public void peek() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return;
		}
		System.out.println("Front element is " + cqueue[front]);
	}
}
