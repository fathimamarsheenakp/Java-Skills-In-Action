package com.kodnest.oops.package2;

import com.kodnest.oops.package1.Demo;

public class Demo5 extends Demo {

	void display5() {
		display1();
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c); CANNOT ACCESS DEFAULT
//		System.out.println(d); CANNOT ACCESS PRIVATE
	}
}
