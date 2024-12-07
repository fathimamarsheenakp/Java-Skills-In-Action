package com.kodnest.dsa.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		CopyOnWriteArrayList ref = new CopyOnWriteArrayList();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(25);
		ref.add(75);
		ref.add(125);
		ref.add(175);
		
		Iterator itr = ref.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			ref.add(99);
		}
		System.out.println("=================================");
		System.out.println(ref);
	}
}
