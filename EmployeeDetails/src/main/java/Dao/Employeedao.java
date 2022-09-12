package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Employee;

public class Employeedao {

	private static SessionFactory factory = null;

	public void addemployee(String loginid,String empname, String department,  String skills, int salary) {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Employee em = new Employee(loginid,empname, department,skills, salary);

		session.save(em);

		tx.commit();
		System.out.println("Employee Added");
		factory.close();
		session.close();
	}
	
}
