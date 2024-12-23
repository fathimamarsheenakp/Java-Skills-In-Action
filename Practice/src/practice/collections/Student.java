package practice.collections;

import java.util.Objects;

public class Student implements Comparable<Student>{

	int id;
	String name;
	char grade;
	
	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student -> Id: " + id + ", Name: " + name + ", Grade: " + grade; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Student ref = (Student) obj;
		// TODO Auto-generated method stub
		return ref.name.equals(this.name) && this.id == ref.id && this.grade == ref.grade;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name, grade);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
