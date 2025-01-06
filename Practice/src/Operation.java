
public class Operation {
	int size;
	int[] cQueue = null;
	int front = -1;
	int rear = -1;
	
	public Operation(int size) {
		this.size = size;
		cQueue = new int[size];
		System.out.println("Circular queue of size " + size + " created successfully");
	}
	
	boolean isFull() {
		return front == (rear + 1) % size;
	}
	
	boolean isEmpty() {
		return front == -1;
	}
	
	void enqueue(int data) {
		if (isFull()) {
			System.out.println("Circular queue is full");
			return;
		} 
		
		if (front == -1) {
			front = 0;
		}
		
		rear = (rear + 1) % size;
		cQueue[rear] = data;
	}
	
	void dequeue() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return;
		} 
		
		if (front == rear) {
			front = rear = -1;
		} else {
			front = (front + 1) % size;
		}
	}
	
	void display() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return;
		} 
		
		int i = front;
		while (true) {
			System.out.print(cQueue[i] + " ");
			if (rear == i) {
				break;
			}
			
			i = (i + 1) % size;
		}
	}
	
	void peek() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return;
		} 
		
		System.out.println("Peek element is " + cQueue[front]);
	}
}
