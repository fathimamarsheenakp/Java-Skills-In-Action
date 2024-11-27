package com.kodnest.dsa.collections.methods;

import java.util.Objects;

public class Student implements Comparable {

	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public boolean equals(Object obj) {
		Student ref = (Student) obj;
		if (this.id == ref.id && this.name.equals(ref.name) && this.marks == ref.marks) {
			return true;
		} else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + marks;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name, marks);
	}
	
	@Override
	public int compareTo(Object o) {
		Student ref = (Student) o;
		return this.name.compareTo(ref.name);
	}
	
	
	
//	@Override
//	public int compareTo(Object o) {
//		Student ref = (Student) o;
//		if (this.id > ref.id) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	
//	@Override
//	public int compareTo(Object o) {
//		Student ref = (Student) o;
//		if (this.marks > ref.marks) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	
}
