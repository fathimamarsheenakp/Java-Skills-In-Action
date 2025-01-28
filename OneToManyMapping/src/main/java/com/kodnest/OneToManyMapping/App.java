package com.kodnest.OneToManyMapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
    public static void main(String[] args) {
  
    	Subject s1 = new Subject("Java", "Punith", "6 months");
    	Student stu1 = new Student("Adithya", "99", "adithya@example.com", s1);
    	Student stu2 = new Student("Bibeesh", "59", "bibeesh@example.com", s1);
    	Student stu3 = new Student("Kalidas", "79", "kalidas@example.com", s1);
    	
    	ArrayList<Student> stulist = new ArrayList<Student>();
    	stulist.add(stu1);
    	stulist.add(stu2);
    	stulist.add(stu3);
    	
    	s1.setStulist(stulist);
    	
    	SessionFactory factory = new Configuration().configure("com/kodnest/OneToManyMapping/hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(s1);
    	transaction.commit();
    	session.close();
    	factory.close();
    	
    }
}
