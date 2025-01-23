package com.kodnest.BankProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter id to delete");
    	int id = sc.nextInt();
    	SessionFactory factory = new Configuration().configure("com/kodnest/BankProject/hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Customer customer = session.get(Customer.class, id);
    	if (customer != null) {
    		session.remove(customer);
    	} else {
    		System.out.println("Customer doesn't exist");
    	}
    	
    	transaction.commit();
    	session.close();
    	factory.close();
    	
    }
}
