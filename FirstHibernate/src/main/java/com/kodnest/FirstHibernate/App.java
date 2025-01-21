package com.kodnest.FirstHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter id, name, marks and email");
    	Student student = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
    	
//    	step 1 - loading the hibernate.cfg.xml
    	Configuration configuration = new Configuration();
    	configuration.configure("com/kodnest/FirstHibernate/hibernate.cfg.xml");
//    	step 2 - build session factory
    	SessionFactory factory = configuration.buildSessionFactory();
    	
//    	step 3 - open session
    	Session session = factory.openSession();
    	
//    	step 4 - begin transaction
    	Transaction transaction = session.beginTransaction();
    	
//    	step 5 - perform transaction
    	session.persist(student);
    	
//    	step 6 - commit transaction
    	transaction.commit();
    	
//    	step 7 - close the session
    	session.close();
    	
//    	step 7 - close the session factory
    	factory.close();
    	
    	sc.close();
    }
}
//hibernate.cfg.xml