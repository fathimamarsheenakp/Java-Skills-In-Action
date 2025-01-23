package com.kodnest.BankProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to fetch data");
		int id = sc.nextInt();
		SessionFactory factory = new Configuration().configure("com/kodnest/BankProject/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer ref = session.get(Customer.class, id);
		System.out.println(ref.getId() + " " + ref.getAccno() + " " + ref.getName() + " " + ref.getAddress() + " " + ref.email + " " + ref.getPhone());
		transaction.commit();
		session.close();
		factory.close();
	}
}
