package com.kodnest.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		Customer customer = new Customer("Kiran");
		Product p1 = new Product("Shirt", "999", customer);
		Product p2 = new Product("Sneakers", "1499", customer);
		Product p3 = new Product("Watch", "11999", customer);
		
		List<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		customer.setProdlist(list);
		
		SessionFactory factory = new Configuration().configure("com/kodnest/OneToManyMapping/hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(customer);
    	transaction.commit();
    	session.close();
    	factory.close();
	}
}
