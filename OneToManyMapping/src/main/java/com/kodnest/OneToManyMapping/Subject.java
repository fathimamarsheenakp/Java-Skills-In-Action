package com.kodnest.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Subject {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String mentor;
	
	@Column
	String duration;
	
	@OneToMany (mappedBy = "subject", cascade = CascadeType.ALL)
	List<Student> stulist = new ArrayList<Student>();
	
	public Subject() {
		
	}

	public Subject(int id, String name, String mentor, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.mentor = mentor;
		this.duration = duration;
	}

	public Subject(String name, String mentor, String duration) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.duration = duration;
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

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Student> getStulist() {
		return stulist;
	}

	public void setStulist(List<Student> stulist) {
		this.stulist = stulist;
	}
	
	
}
