package practice.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

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
	
	private Node root = null;
	
	public BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		
		System.out.println("Enter number of node to create: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		System.out.println("Enter node values");
		for (int i = 0; i < n; i++) {
			values.add(sc.nextInt());
		}
		
		tree.insert(values);
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
	
	void insert(ArrayList<Integer> values) {
		if (values == null || values.size() == 0) {
			return;
		}
		
		root = new Node(values.get(0));
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		int i = 1;
		while (i < values.size()) {
			Node node = queue.poll();
			
			if (i < values.size()) {
				node.left = new Node(values.get(i++));
				queue.add(node.left);
			}
			
			if (i < values.size()) {
				node.right = new Node(values.get(i++));
				queue.add(node.right);
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
