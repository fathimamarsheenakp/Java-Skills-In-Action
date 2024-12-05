package com.kodnest.dsa.collections.utilitymethods;

import java.util.*;

public class SortObj {
	public static void main(String[] args) {
		List ls= new ArrayList();
		ls.add(new Student(100, "Zakeeb", 56));
		ls.add(new Student(96, "Aveneesh", 100));
		ls.add(new Student(97, "Shivanesh", 98));
		ls.add(new Student(10, "Chavi", 68));
		
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
	}
}
