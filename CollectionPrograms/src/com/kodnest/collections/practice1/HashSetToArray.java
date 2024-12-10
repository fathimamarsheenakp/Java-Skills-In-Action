package com.kodnest.collections.practice1;

import java.util.*;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(8);
		hs.add(0);
		hs.add(9);
		hs.add(5);
		hs.add(0);
		hs.add(0);
		hs.add(0);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println("Hash Set --->" + hs);
		Object[] arr = hs.toArray();
		int[] array = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			Integer j = (Integer)arr[i];
//			UNBOXING
			array[i] = j.intValue();
		}
		
		System.out.print("Array --> ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		
	}
}
