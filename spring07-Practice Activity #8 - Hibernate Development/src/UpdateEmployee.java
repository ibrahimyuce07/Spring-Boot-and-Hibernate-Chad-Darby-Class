import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Write employee id to update: ");
		int employeeId = scanner.nextInt();
		scanner.nextLine();

		System.out.println("\nGetting employee with id: " + employeeId);

		Employee myEmployee = session.get(Employee.class, employeeId);
		System.out.print("Update " + employeeId + "'s new first name : ");
		String newFirstName = scanner.nextLine();
		myEmployee.setFirstName(newFirstName);
		System.out.println("Updating employee...");

		session.getTransaction().commit();
		System.out.println("Done!");
		factory.close();

	}

}
