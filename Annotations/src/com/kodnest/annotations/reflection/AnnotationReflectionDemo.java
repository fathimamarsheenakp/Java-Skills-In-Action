package com.kodnest.annotations.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationReflectionDemo {

	public static void main(String[] args) {
		try {
			// Step 1: Get the Class object for TestClass
			Class<TestClass> clazz = TestClass.class;
			
			// Step 2: Check if the class has the annotation
			if (clazz.isAnnotationPresent(MyAnnotation.class) ) {
				// Retrieve the annotation instance
				MyAnnotation classAnnotation = clazz.getAnnotation(MyAnnotation.class);
				System.out.println("Class Annotation:");
                System.out.println("	Value: " + classAnnotation.value());
                System.out.println("	Priority: " + classAnnotation.priority());
			}
			
			System.out.println();
			System.out.println("Method Annotation");
			// Step 3: Access all methods in the class
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                // Check if a method has the annotation
                if (method.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
                    System.out.println("	Method: " + method.getName());
                    System.out.println("	Value: " + methodAnnotation.value());
                    System.out.println("	Priority: " + methodAnnotation.priority());
                }
            }
            
            System.out.println();
            System.out.println("Field Annotation");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
				if (field.isAnnotationPresent(MyAnnotation.class)) {
					MyAnnotation fieldAnnotation = field.getAnnotation(MyAnnotation.class);
					System.out.println("	Field: " + field.getName());
					System.out.println("	Value: " + fieldAnnotation.value());
					System.out.println("	Priority: " + fieldAnnotation.priority());
				}
			}
            
         // Step 5: Access inner classes
            System.out.println();
            System.out.println("Inner class Annotation");
            Class<?>[] innerClasses = clazz.getDeclaredClasses();
            for (Class<?> innerClass : innerClasses) {
                if (innerClass.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation innerClassAnnotation = innerClass.getAnnotation(MyAnnotation.class);
                    System.out.println("	Inner Class: " + innerClass.getSimpleName());
                    System.out.println("	Value: " + innerClassAnnotation.value());
                    System.out.println("	Priority: " + innerClassAnnotation.priority());
                }
            }
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
