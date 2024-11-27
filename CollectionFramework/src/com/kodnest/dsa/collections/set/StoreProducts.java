package com.kodnest.dsa.collections.set;

import java.util.LinkedHashSet;

public class StoreProducts {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		
		hs.add(new Product(120, "RedTape - Shoe", 3500));
		hs.add(new Product(145, "Levis - Shoe", 4500));
		hs.add(new Product(175, "Gucci - Shoe", 100000));
		hs.add(new Product(145, "Levis - Shoe", 4500));
		hs.add(new Product(175, "Gucci - Shoe", 100000));
		
		System.out.println(hs);
	}
}
