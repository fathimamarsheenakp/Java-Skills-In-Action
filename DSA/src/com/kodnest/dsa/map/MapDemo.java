package com.kodnest.dsa.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(100, new Student(120, "Akash", "Male", "Kochi"));
		hm.put(50, new Student(121, "Priya", "Female", "Shornur"));
		hm.put(120, new Student(123, "Gokul", "Male", "Alappuzha"));
		hm.put(80, new Student(122, "Seema", "Female", "chicago"));
		System.out.println("hm--->" + hm);
		
		System.out.println("=========================================");
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(100, new Student(120, "Akash", "Male", "Kochi"));
		lhm.put(50, new Student(121, "Priya", "Female", "Shornur"));
		lhm.put(120, new Student(123, "Gokul", "Male", "Alappuzha"));
		lhm.put(80, new Student(122, "Seema", "Female", "chicago"));
		System.out.println("lhm--->" + lhm);
		
		System.out.println("=============================================");
		TreeMap tm = new TreeMap();
		tm.put(100, new Student(120, "Akash", "Male", "Kochi"));
		tm.put(50, new Student(121, "Priya", "Female", "Shornur"));
		tm.put(120, new Student(123, "Gokul", "Male", "Alappuzha"));
		tm.put(80, new Student(122, "Seema", "Female", "chicago"));
		System.out.println("tm--->" + tm);
		
		System.out.println("===============================================");
		TreeMap<String, Integer> tm2 = new TreeMap<String, Integer>();
		tm2.put("First", 50);
		tm2.put("Second", 55);
		tm2.put("Third", 60);
		tm2.put("Forth", 75);
		System.out.println("tm2--->"+tm2);
		
	}
}
