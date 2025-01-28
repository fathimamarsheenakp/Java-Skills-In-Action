package com.kodnest.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	
    	Course course1 = new Course("SDE-1");
    	Course course2 = new Course("SDET");
    	List<Course> clist = new ArrayList<Course>();
    	clist.add(course1);
    	clist.add(course2);
    	
    	Student student1 = new Student("Karan");
    	Student student2 = new Student("Nitya");
    	List<Student> slist = new ArrayList<Student>();
    	slist.add(student1);
    	slist.add(student2);
    	
    	course1.setStudentlist(slist);
    	course2.setStudentlist(slist);
    	student1.setCourselist(clist);
    	student2.setCourselist(clist);
    	
    	SessionFactory factory = new Configuration().configure("com/kodnest/ManyToManyMapping/hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(student1);
    	session.persist(student2);
    	transaction.commit();
    	session.close();
    	factory.close();
    }
}
