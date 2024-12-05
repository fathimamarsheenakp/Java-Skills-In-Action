package com.kodnest.dsa.map;

import java.util.*;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		String key1 = new String("Ram");
		String key2 = new String("Ram");
		HashMap hm = new HashMap();
		hm.put(key2, 100);
		hm.put(key2, 200);
		System.out.println("HashMap -> " + hm);
		
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(key1, 500);
		ihm.put(key2, 600);
		System.out.println("IdentityHashMap -> " + ihm);
	}
}
