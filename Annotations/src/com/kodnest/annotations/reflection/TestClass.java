package com.kodnest.annotations.reflection;

@MyAnnotation(value = "Class Annotation", priority = 5)
public class TestClass {

	@MyAnnotation(value = "Method Annotation", priority = 10)
	public void testMethod() {
		System.out.println("Executing testMethod");
	}
	
	@MyAnnotation(value = "Greet Method Annotation", priority = 3)
	public void greet() {
		System.out.println("Hello Everyone");
	}
	
	@MyAnnotation(value = "Field Annoatation", priority = 4)
	String name;
	
	@MyAnnotation(value = "Inner Class Annotation", priority = 6)
	class Inner {
		
	}
	
}
