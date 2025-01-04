package com.kodnest.dsa.implementations;

import java.util.Scanner;

public class BinarySearchTree {

	class Node {
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	Node root;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Enter number of nodes to create");
		int n = sc.nextInt();
		
		System.out.println("Enter node valaues");
		for (int i = 0; i < n; i++) {
			bst.insert(sc.nextInt());
		}
		
		System.out.println("Inorder Traversal: ");
		bst.inorder();
		System.out.println();
		
		System.out.println("Enter node to delete");
		bst.delete(sc.nextInt());
		System.out.println("After deletion");
		bst.inorder();
		System.out.println();
		
		System.out.println("Enter node to search");
		if (bst.search(sc.nextInt())) {
			System.out.println("Data found");
		} else {
			System.out.println("Data not found");
		}
	}
	
	public BinarySearchTree() {
		root = null;
	}
	
	void insert(int data) {
		root = insertRec(root, data);
	}
	
	Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	
	void inorder() {
		inorderRec(root);
	}
	
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}
	
	void delete(int data) {
		root = deleteRec(root, data);
	}
	
	Node deleteRec(Node root, int data) {
		if (root == null) {
			return root;
		}
		if (data < root.data) {
			root.left = deleteRec(root.left, data);
		} else if (data > root.data) {
			root.right = deleteRec(root.right, data);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			
			root.data = minValue(root.right);
			root.right = deleteRec(root.right, root.data);
		}
		return root;
	}
	
	int minValue(Node root) {
		int minValue = root.data;
		while (root.left != null) {
			minValue = root.left.data;
			root = root.left;
		}
		return minValue;
	}
	
	boolean search(int data) {
		return searchRec(root, data) != null;
	}
	
	Node searchRec(Node root, int data) {
		if (root == null || root.data == data) {
			return root;
		} 
		
		if (data < root.data) {
			return searchRec(root.left, data);
		} else {
			return searchRec(root.right, data);
		}
	}
}
