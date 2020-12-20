
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		Scanner scanner = new Scanner(System.in);
		System.out.print("\n Employee id to delete : ");
		int id = scanner.nextInt();
		scanner.close();
		Employee tempEmployee = new Employee(id);

		session.beginTransaction();
		System.out.println("\nDeleting employee...");
		session.delete(tempEmployee);

		session.getTransaction().commit();
		System.out.println("\nDone...");

		factory.close();

	}

}
