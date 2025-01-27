package com.kodnest.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	
    	Productimage image = new Productimage("https://d118ps6mg0w7om.cloudfront.net/media/catalog/product/1/_/fit-in/1000x1333/1_bndr-4148-t-78-light-grey.jpg");
    	Product product = new Product("Max Casual Shirt", 999, 21, image);
    	
    	SessionFactory factory = new Configuration().configure("com/kodnest/OneToOneMapping/hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(product);
    	transaction.commit();
    	session.close();
    	factory.close();
    }
}
