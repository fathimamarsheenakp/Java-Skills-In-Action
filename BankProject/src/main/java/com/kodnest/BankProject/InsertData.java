package com.kodnest.BankProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

	public static void main(String[] args) {
		Customer customer = new Customer(1253, "Sanjana", "Cochi", "sanjana@kodnest", "8547925236");
		SessionFactory factory = new Configuration().configure("com/kodnest/BankProject/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(customer);
		transaction.commit();
		session.close();
		factory.close();
	}
}
