package com.kodnest.dsa.collections.generics;

public class Demo<Type> {
	Type i;
	
	public void set(Type i) {
		this.i = i;
	}
	
	public void display() {
		System.out.println(i);
	}
	
	public <L>void sampling(L a) {
		System.out.println(a);
	}

}
