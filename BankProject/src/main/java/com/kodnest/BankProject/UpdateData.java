package com.kodnest.BankProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to update");
		int id = sc.nextInt();
		SessionFactory factory = new Configuration().configure("com/kodnest/BankProject/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		if (customer != null) {
			System.out.println(customer.getName() + "  " + customer.getAddress() + "  " + customer.getEmail() + "  "  + customer.getPhone());
			outer:while(true) {
				System.out.println("Enter attribute to update");
				System.out.println("name | address | email | phone");
				System.out.println("Enter exit to quit");
				String ch = sc.next().toLowerCase();
				switch(ch) {
				case "name":
					System.out.println("Enter new name");
					String newName = sc.next();
					customer.setName(newName);
					break;
				case "address":
					System.out.println("Enter new address");
					String newAddress = sc.next();
					customer.setAddress(newAddress);
					break;
					
				case "email":
					System.out.println("Enter new email address");
					String newMail = sc.next();
					customer.setEmail(newMail);
					break;
					
				case "phone":
					System.out.println("Enter new phone number");
					String newPhone = sc.next();
					customer.setPhone(newPhone);
					break;
					
				default:
					break outer;
				}
			}
			customer = session.merge(customer);
			transaction.commit();
			System.out.println(customer);
			session.close();
			factory.close();
		} else {
			System.out.println("Customer doesn't exist");
		}
	}
}
