import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class QueryEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();

		List<Employee> employees = session.createQuery("from Employee").getResultList();
		// displayEmployee(employees);

		employees = session.createQuery("from Employee e where e.company='company1'").getResultList();
		displayEmployee(employees);
	}

	private static void displayEmployee(List<Employee> employees) {
		for (Employee tempEmployee : employees) {
			System.out.println(tempEmployee);
		}
	}

}
