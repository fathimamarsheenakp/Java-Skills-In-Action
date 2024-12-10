package com.kodnest.dsa.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		Vector ref = new Vector();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(70);
		ref.add(25);
		ref.add(175);
		ref.add(55);
		
		Enumeration en = ref.elements();
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
			
		}
	}
}
