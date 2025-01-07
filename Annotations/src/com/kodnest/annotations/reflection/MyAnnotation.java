package com.kodnest.annotations.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Keep annotation available at runtime
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.FIELD}) // Can be applied to classes and methods
public @interface MyAnnotation {
	String value() default "Default Value"; // Annotation property with default value
	int priority() default 1;
}
