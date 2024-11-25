package com.kodnest.dsa.implementations;

public class DoublyLinkedList {

	class Node {
		Node preLink;
		int data;
		Node nextLink;
		
		public Node(int data) {
			this.preLink = null;
			this.data = data;
			this.nextLink = null;
		}
	}
	
	Node first = null;
	
	public void insertAtRear(int element) {
		Node node = new Node(element);
				
		if (first == null) {
			first = node;
		} else if (first.nextLink == null) {
			first.nextLink = node;
			node.preLink = first;
		} else {
			Node temp = first;
			while (temp.nextLink != null) {
				temp = temp.nextLink;
			}
			temp.nextLink = node;
			node.preLink = temp;
		}
	}
	
	public void insertAtFront(int element) {
		Node node = new Node(element);
		
		if (first == null) {
			first = node;
		} else {
			node.nextLink = first;
			first.preLink = node;
			first = node;
		}
	}
	
	public void deleteFromRear() {
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.nextLink == null){
			System.out.println("Deleted element is " + first.data);
			first = null;
		} else {
			Node temp = first;
			while (temp.nextLink.nextLink != null) {
				temp = temp.nextLink;
			}
			System.out.println("Deleted element is " + temp.nextLink.data);
			temp.nextLink.preLink = null;
			temp.nextLink = null;
		}
	}
	
	public void deleteFromFront() {
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.nextLink == null){
			System.out.println("Deleted element is " + first.data);
			first = null;
		} else {
			System.out.println("Deleted element is " + first.data);
			first = first.nextLink;
			first.preLink.nextLink = null;
			first.preLink = null;
			
		}
	}
	
	public void displayForward() {
		if (first == null) {
			System.out.println("Doubly Linked List is empty");
		} else {
			Node temp = first;
			System.out.print("Forward: ");
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.nextLink;
			}
			System.out.print("null");
		}
	}
	
	public void displayReverse() {
		if (first == null) {
			System.out.println("Doubly Linked List is empty");
		} else {
			System.out.print("Reverse: ");
			Node temp = first;
			while (temp.nextLink != null) {
				temp = temp.nextLink;
			}
			System.out.print("null");
			while (temp != null) {
				System.out.print(" -> " + temp.data );
				temp = temp.preLink;
			}
			
		}
	}
}
