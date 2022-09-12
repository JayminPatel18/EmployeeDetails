package Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Employee;

public class EmployeeDeleteDao {

	private static SessionFactory factory = null;

	public boolean deleteemployee(Integer id) {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee em = (Employee) session.get(Employee.class, id);
			if(em!=null) {
				session.delete(em);
                System.out.println("Employee details deleted");
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			factory.close();
			session.close();
		}
		return true;
	}
	
}
