package com.kodnest.designpattern.singlton;

public class PrimeMinister {
	static PrimeMinister pm = null;
	String name;
	
	private PrimeMinister() {
		
	}
	
	public static PrimeMinister getObject() {
		if (pm == null) {
			pm = new PrimeMinister();
		} 
		return pm;
	}
}
