package com.kodnest.collections.practice1;

import java.util.*;

public class RemoveDupFromHashMap {

	public static void main(String[] args) {
		Keys price1 = new Keys(100);
		Keys price2 = new Keys(200);
		Keys price3 = new Keys(300);
		Keys price4 = new Keys(400);
		
		HashMap<Keys, String> products = new HashMap<Keys, String>();
		products.put(price1, "Orange");
		products.put(price2, "Banana");
		products.put(price3, "Banana");
		products.put(price4, "Mango");
		System.out.println(products);
		System.out.println();
		
		products = removeDuplicate(products);
		System.out.println("After removing dupliacte: " + products);
		
	}
	
	public static HashMap<Keys, String> removeDuplicate(HashMap<Keys, String> original) {
	    HashSet<String> hs = new HashSet<String>(); // To store unique values
	    HashMap<Keys, String> result = new HashMap<Keys, String>(); // To store the result without duplicates

	    Set<Keys> keys = original.keySet(); // Get all keys from the original map
	    Collection<String> values = original.values(); // Get all values from the original map

	    Iterator<Keys> itr = keys.iterator(); // Iterator to iterate through keys
	    while (itr.hasNext()) {
	        Keys key1 = itr.next(); // Get the next key
	        String value1 = original.get(key1); // Get the value associated with the key

	        int freq = Collections.frequency(values, value1); // Count the frequency of this value in the map
	        if (freq > 1) { // If the value appears more than once
	            if (!hs.contains(value1)) { // If the value is not already added to the set
	                hs.add(value1); // Add the value to the HashSet
	                result.put(key1, value1); // Add the key-value pair to the result map
	            }
	        } else {
	            result.put(key1, value1); // If the value is unique, add it to the result map
	        }
	    }
	    return result; // Return the map with duplicates removed
	}

}
