package com.kodnest.dsa.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(100, "Kavya");
		hm.put(50, "Kalpana");
		hm.put(150, "Keerthana");
		hm.put(25, "Kanchana");
		hm.put(75, "Kareena");
		hm.put(125, "Kajol");
		hm.put(175, "Katrina");
		System.out.println(hm);
		
		System.out.println("===================================");
		Set s = hm.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		System.out.println("=====================================");
		Collection c = hm.values();
		it = c.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		System.out.println("=======================================");
		
		Set e = hm.entrySet();
		it = e.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		System.out.println();
	}
}
