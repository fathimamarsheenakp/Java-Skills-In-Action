package com.kodnest.dsa.implementations;

public class SinglyLinkedList {

	class Node {
		int data;
		Node nextLink;
	}
	
	Node first = null;
	
	public void insertRear(int element) {
		Node node = new Node();
		node.data = element;
		node.nextLink = null;
		
		if (first == null) {
			// If the list is empty, set the new node as the first node
			first = node;
		} else if (first.nextLink == null) {
			// If there's only one node in the list, link it to the new node
			first.nextLink = node;
		} else {
			// If there are multiple nodes, traverse to the last node and link the new node
			Node temp = first;
			while (temp.nextLink != null) {
				temp = temp.nextLink;
			}
			temp.nextLink = node;
		}
	}
	
	public void insertFront(int element) {
		Node node = new Node();
		node.data = element;
		node.nextLink = null;
		
		if (first == null) {
			first = node;
		} else {
			node.nextLink = first;
			first = node;
		}
	}
	
	public void deleteRear() {
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.nextLink == null) {
			System.out.println("Deleted element is " + first.data);
			first = null;
		} else {
			Node temp = first;
			while (temp.nextLink.nextLink != null) {
				temp = temp.nextLink;
			}
			System.out.println("Deleted element is " + temp.nextLink.data);
			temp.nextLink = null;
		}
	}
	
	public void deleteFront() {
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.nextLink == null) {
			System.out.println("Deleted element is " + first.data);
			first = null;
		} else {
			System.out.println("Deleted element is " + first.data);
			first = first.nextLink;
		}
	}
	
	public void display() {
		if (first == null) {
			System.out.println("Nothing to display");
		} else if (first.nextLink == null) {
			System.out.print("Linked List: ");
			System.out.print(first.data + " -> ");
			System.out.print("null");
			System.out.println();
		} else {
			Node temp = first;
			System.out.println();
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.nextLink;
			}
			System.out.print("null");
			System.out.println();
		}
	}
}
