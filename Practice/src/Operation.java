
public class Operation {
	int[] queue = null;
	int front = -1;
	int rear = -1;
	
	public Operation(int size) {
		queue = new int[size];
		System.out.println("queue of size " + size + " created successfully");
	}
	
	public void enqueue(int element) {
		if (queue == null) {
			System.out.println("Create a queue first!");
			return;
		}
		if (front == -1) {
			front = 0;
		}
		if (rear == queue.length - 1) {
			System.out.println("queue is full!");
		} else {
			++rear;
			queue[rear] = element;
		}
	}
	
	public void dequeue() {
		if (rear == -1 || front > rear) {
			System.out.println("queue is empty!");
		} else {
			int ele = queue[front];
			queue[front] = 0;
			++front;
			System.out.println("Element " + ele + " popped from the queue");
		}
	}
	
	public void peek() {
		if (rear == -1 || front > rear) {
			System.out.println("queue is empty!");
		} else {
			System.out.println("Peek Element is " + queue[front]);
		}
	}
	
	public void display() {
		if (rear == -1 || front > rear) {
			System.out.println("queue is empty!");
		} else {
			System.out.println("queue is: ");
			for (int i = front; i <= rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		}
	}
}
