package com.kodnest.dsa.collections.generics;

import java.util.ArrayList;

public class CollectionGenerics {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(100);
		arrayList.add("Ramu");
		arrayList.add(true);
		arrayList.add(3.14);
		System.out.println(arrayList);
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(100);
//		arrayList2.add("Shibu"); cannot add
		arrayList2.add(200);
		arrayList2.add(300);
		System.out.println(arrayList2);
	}  
}
