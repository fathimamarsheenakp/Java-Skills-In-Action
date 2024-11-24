package com.kodnest.oops.package1;

public class Demo2 {
	Demo demo = new Demo();

	void display2() {
		System.out.println(demo.a);
		System.out.println(demo.b);
		System.out.println(demo.c);
//		System.out.println(demo.d); PRIVATE CANNOT ACCESS 
	}
}
