package com.kodnest.dsa.collections.utilitymethods;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		al.add(100);
		al.add(100);
		al.add(100);
		al.add(100);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting : " + al);
		System.out.println(Collections.binarySearch(al, 25));
		System.out.println(Collections.frequency(al, 100));
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		
		List al2 = new ArrayList();
		al2.add(500);
		al2.add(1000);
		System.out.println("al1--> " +al);
		System.out.println("al2--> " +al2);
		System.out.println(Collections.disjoint(al, al2));
		
		List al3 = new ArrayList();
		al3.add(1000);
		al3.add(500);
		al3.add(1500);
		al3.add(250);
		al3.add(750);
		al3.add(1250);
		al3.add(1750);
		al3.add(1000);
		al3.add(1000);
		al3.add(1000);
		al3.add(1000);
		System.out.println("al3--> " + al3);
		Comparator c = Collections.reverseOrder();
		Collections.sort(al3, c);
		System.out.println("After sorting: " + al3);
		
	}
}
