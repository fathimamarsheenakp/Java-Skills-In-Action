package com.kodnest.collections.practice1;

import java.util.*;

public class ReadOnlyArray {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		arr.add(600);
		arr.add(700);
		System.out.println(arr);
		arr.remove(5);
		System.out.println(arr);
		arr.add(800);
		System.out.println(arr);
		
		System.out.println();
		System.out.println("=========READ ONLY ARRAY==================");
		arr = Collections.unmodifiableList(arr);
		System.out.println(arr);
	}
}
