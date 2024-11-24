package com.kodnest.oops.statics;

import java.util.Scanner;

public class BussinessMan {
	int p;
	int t;
	static float r;
	float si;
	
	static {
		r = 2.0f;
	}
	
	void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle");
		p = sc.nextInt();
		System.out.println("Enter time");
		t = sc.nextInt();	
	}
	
	void calculateSI() {
		si = (p * t * r) /100;
	}
	
	void displaySI() {
		System.out.println("SI is " + si);
	}
}
