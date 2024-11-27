package com.kodnest.dsa.collections.set;

import java.util.TreeMap;
import java.util.TreeSet;

public class DemoTree {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println("ts --> " + ts);
		System.out.println("==================================================");
		System.out.println("ceiling(45) --> " + ts.ceiling(45));
		System.out.println("higher(45) --> " + ts.higher(45));
		System.out.println("ceiling(50) --> " + ts.ceiling(50));
		System.out.println("higher(50) --> " + ts.higher(45));
		System.out.println("==================================================");
		
		System.out.println("==================================================");
		System.out.println("floor(45) --> " + ts.floor(45));
		System.out.println("lower(45) --> " + ts.lower(45));
		System.out.println("floor(75) --> " + ts.floor(75));
		System.out.println("lower(50) --> " + ts.lower(75));
		System.out.println("==================================================");

		System.out.println("headSet --> " + ts.headSet(75));
		System.out.println("tailSet --> " + ts.tailSet(75));
		System.out.println("==================================================");

		System.out.println("subSet --> " + ts.subSet(50, 125));	
		
	}
}
