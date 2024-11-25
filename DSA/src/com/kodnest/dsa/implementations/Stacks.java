package com.kodnest.dsa.implementations;

public class Stacks {
	private int size = 0;
	private int[] stack;
	private int top = -1;
	
	public Stacks(int size) {
		this.size = size;
		stack = new int[size];
		System.out.println("Stack of size " + size + " created successfully!");
		System.out.println();
	}
	
	public void push(int element) {
		if (top == size - 1) {
			System.out.println("Stack is full. Push not possible");
		} else {
			++top;
			stack[top] = element;
			System.out.println(element + " pushed to the stack");
		}
	}
	
	public void pop() {
		if (top == -1) {
			System.out.println("Stack is empty. Pop not possible");
		} else {
			System.out.println(stack[top] + " deleted successfully!");
			stack[top] = 0;
			--top;
		}
	}
	
	public void getElement(int index) {
		if (index > top) {
			System.out.println("Enter position between 0 and " + top);
		} else if (index == top) {
			System.out.println(stack[top]);
		} else {
			System.out.println(stack[index]);
		}
	}
	
	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty. Nothing to display");
		} else {
			System.out.println("Stack: ");
			for (int i = stack.length - 1; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
}
