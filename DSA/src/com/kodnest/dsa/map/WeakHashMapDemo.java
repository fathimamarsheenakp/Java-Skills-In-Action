package com.kodnest.dsa.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		Integer k1 = new Integer(100);
		Integer k2 = new Integer(200);
		Integer k3 = new Integer(300);
		
		Employee e1 = new Employee(1, "Priyan");
		Employee e2 = new Employee(2, "Kiara");
		Employee e3 = new Employee(3, "Varun");
		
//		HashMap hm = new HashMap();
//		hm.put(k1, e1);
//		hm.put(k2, e2);
//		hm.put(k3, e3);
//		System.out.println("hm-->" + hm);
//		System.out.println("=========================");
		
		WeakHashMap whm = new WeakHashMap();
		whm.put(k1, e1);
		whm.put(k2, e2);
		whm.put(k3, e3);
		System.out.println("whm-->" + whm);
		System.out.println("=========================");
		System.out.println("After removing");
		
		k1 = null;
		e1 = null;
		System.gc();
		for (int i = 0; i < 5000; i++) {
			System.out.print(" ");
		}
//		System.out.println();
//		System.out.println("hm-->" + hm);
//		System.out.println("=========================");
		
		System.out.println();
		System.out.println("whm-->" + whm);
		System.out.println("=========================");
	}
}
