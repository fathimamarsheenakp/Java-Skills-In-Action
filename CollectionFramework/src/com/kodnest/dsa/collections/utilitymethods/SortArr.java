package com.kodnest.dsa.collections.utilitymethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortArr {

	public static void main(String[] args) {
		List arr  = new ArrayList();
		arr.add(86);
		arr.add(42);
		arr.add(23);
		arr.add(18);
		arr.add(25);
		System.out.println("Array: " + arr);
		
		TreeSet ts = new TreeSet();
		ts.addAll(arr);
		System.out.println("Tree Set: " + ts);
		
		Collections.sort(arr);
		System.out.println("Array: " + arr);
	}
}
