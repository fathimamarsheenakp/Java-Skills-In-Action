package com.kodnest.dsa.collections.queue;

import java.util.ArrayDeque;

public class Demo {

	public static void main(String[] args) {
		ArrayDeque arrayDeque = new ArrayDeque();
		arrayDeque.add(10);
		arrayDeque.add(20);
		arrayDeque.add(30);
		arrayDeque.add(40);
		arrayDeque.add(50);
		System.out.println(arrayDeque);
		
		System.out.println("-----------------------------------------------");
		System.out.println(arrayDeque.remove());
		System.out.println(arrayDeque);
		
		System.out.println("-----------------------------------------------");
		System.out.println(arrayDeque.removeLast());
		System.out.println(arrayDeque);
		
		System.out.println("-----------------------------------------------");
		System.out.println(arrayDeque.removeFirst());
		System.out.println(arrayDeque);
		
		System.out.println("-----------------------------------------------");
		ArrayDeque arrayDeque2 = new ArrayDeque();
		arrayDeque2.add(40);
		arrayDeque2.add(50);
		arrayDeque2.add(60);
		arrayDeque2.add(70);
		arrayDeque2.add(80);
		System.out.println("Deque-1: " + arrayDeque);
		System.out.println("Deque-2: " + arrayDeque2);
		
		arrayDeque2.retainAll(arrayDeque);
		System.out.println("Deque-2: " + arrayDeque2);
	}
}
