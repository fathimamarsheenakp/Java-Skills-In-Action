package com.kodnest.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchAll {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/kodnest/HQL/hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	String hql = "from Employee";
    	Query query = session.createQuery(hql, Employee.class);
    	@SuppressWarnings("unchecked")
		List<Employee> emplist = query.getResultList();
    	for (Employee employee : emplist) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
		}
    	transaction.commit();
    	session.close();
    	factory.close();
	}
}
