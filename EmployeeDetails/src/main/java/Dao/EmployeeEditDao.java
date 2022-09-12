package Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Employee;

public class EmployeeEditDao {

	private static SessionFactory factory = null;

	public boolean updateemployee(Integer id,String empname,String department,String skills,int salary) {

		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			Employee em = (Employee) session.get(Employee.class, id);
			if (em != null) {
				em.setEmpname(empname);
				em.setDepartment(department);
				em.setSkills(skills);
				em.setSalary(salary);
				
				session.update(em);
			}
			tx.commit();
			System.out.println("Employee Details updated");
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
