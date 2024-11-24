//import com.kodnest.oops.package1.Demo;
package com.kodnest.oops.package2;
import com.kodnest.oops.package1.Demo;

public class Demo4 {
	Demo demo = new Demo();
	public void display4() {
		System.out.println(demo.a);
//		System.out.println(demo.b); CANNOT ACCESS PROTECTED
//		System.out.println(demo.c); CANNOT ACCESS DEFUALT
//		System.out.println(demo.d); CANNOT ACCESS PRIVATE
		System.out.println("==================");
	}
}
