package com.kodnest.designpattern.singlton;

public class IndiaApp {

	public static void main(String[] args) {
		PrimeMinister pm =  PrimeMinister.getObject();
		System.out.println(pm);
		
		PrimeMinister pm1 =  PrimeMinister.getObject();
		System.out.println(pm1);
	}
}
