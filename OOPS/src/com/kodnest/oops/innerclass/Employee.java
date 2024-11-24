package com.kodnest.oops.innerclass;

// STATIC INNER CLASS
public class Employee {

	static class Name {
		 String fn;
		 String mn;
		 String ln;
		public Name(String fn, String mn, String ln) {
			super();
			this.fn = fn;
			this.mn = mn;
			this.ln = ln;
		}
		
		 void displayName() {
			 System.out.println(fn + " " + mn + " " + ln);
		 }
	}
	
	Name name;
	int age;
	int salary;
	
	void work() {
		System.out.println(name.fn + " " + name.mn + " " + name.ln + " is working.....");
	}
}
