package com.kodnest.dsa.iterator;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		ArrayList ref = new ArrayList();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(70);
		ref.add(25);
		ref.add(175);
		ref.add(55);
		
		ListIterator itr = ref.listIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		ListIterator itr1 = ref.listIterator(ref.size() - 1);
		while (itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}
		
//		ARRAYLIST HAS NO DESCENDING ITERATOR
//		PriorityQueue HAS NO DESCENDING ITERATOR
//		HashSet HAS NO DESCENDING ITERATOR
//		LinkedHashSet HAS NO DESCENDING ITERATOR
		
		LinkedHashSet ref1 = new LinkedHashSet();
		ref1.add(100);
		ref1.add(50);
		ref1.add(150);
		ref1.add(70);
		ref1.add(25);
		ref1.add(175);
		ref1.add(55);
		ref1.add(175);
		ref1.add(null);
		
//		ArrayDeque has no listIterator
//		PriorityQueue has no listIterator
//		TreeSet has no listIterator
//		HashSet has no listIterator
//		LinkedHashSet has no listIterator
		
		System.out.println();
		System.out.println("============================");
		System.out.println(ref1);
	}
	
}
