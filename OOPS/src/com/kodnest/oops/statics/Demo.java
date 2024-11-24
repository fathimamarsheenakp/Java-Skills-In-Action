package com.kodnest.oops.statics;

public class Demo {
	static int a;
	static int b;
	static int c;
	
	int x;
	int y;
	int z;
	
	static {
		a = 100;
		b = 200;
		c = 300;
		
//		x = 150;
//		y = 250;
//		z = 350;
		
	}
	
	public static void display() {
		System.out.println(a + " " + b + " " + c);
//		System.out.println(x + " " + y + " " + z);
	}
	
	{
		x = 500;
		y = 600;
		z = 700;
		a = 800;
		b = 900;
		c = 1000;
	}
	
	void display2() {
		System.out.println(x + " " + y + " " + z);
		System.out.println(a + " " + b + " " + c);
	}
}
