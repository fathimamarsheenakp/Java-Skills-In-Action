package com.kodnest.dsa.implementations;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.data = data;
			right= null;
			left = null;
		}
	}
	
	private Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		
		System.out.println("Enter the number of nodes to be created: ");
		int n = sc.nextInt();
		
		System.out.println("Enter node values");
		for (int i = 0; i < n; i++) {
			tree.insert(sc.nextInt());
		}
		
		System.out.println();
		
		System.out.println("Preorder traversal: ");
		tree.preorder(tree.root);
		System.out.println();
		
		System.out.println("Inorder traversal: ");
		tree.inorder(tree.root);
		System.out.println();
		
		System.out.println("Postorder traversal: ");
		tree.postorder(tree.root);
		System.out.println();
	}
	
	void insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node currNode = queue.poll();
			
			if (currNode.left == null) {
				currNode.left = newNode;
				return;
			} else {
				queue.add(currNode.left);
			}
			
			if (currNode.right == null) {
				currNode.right = newNode;
				return;
			} else {
				queue.add(currNode.right);
			}
		}
	}
	
	void preorder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}
	
	void postorder(Node node) {
		if (node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data + " ");
		}
	}
}