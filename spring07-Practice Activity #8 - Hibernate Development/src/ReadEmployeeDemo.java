import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class ReadEmployeeDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		System.out.print("Write employee id to read: ");
		int id = scanner.nextInt();
		scanner.close();
		Employee tempEmployee = new Employee(id);

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		System.out.println("\nGetting employee with id: " + tempEmployee.getId());
		Employee myEmployee = session.get(Employee.class, tempEmployee.getId());
		System.out.println("Get complete: " + myEmployee);

		session.getTransaction().commit();
		System.out.println("Done!");

	}

}
