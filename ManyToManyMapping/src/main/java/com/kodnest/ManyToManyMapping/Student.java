package com.kodnest.ManyToManyMapping;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (name = "student_course", 
				joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
	List<Course> courselist;
	
	public Student() {

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
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

	public List<Course> getCourselist() {
		return courselist;
	}

	public void setCourselist(List<Course> courselist) {
		this.courselist = courselist;
	}
	
	
	
}
