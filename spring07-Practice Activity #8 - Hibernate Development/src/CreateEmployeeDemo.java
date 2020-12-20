
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class CreateEmployeeDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\n Employee first name : ");
			String firstName = scanner.nextLine();
			System.out.print("\n Employee last name : ");
			String lastName = scanner.nextLine();
			System.out.print("\n Company : ");
			String company = scanner.nextLine();
			scanner.close();
			Employee tempEmployee = new Employee(firstName, lastName, company);

			session.beginTransaction();

			System.out.println("\nCreating new employee...");
			session.save(tempEmployee);

			session.getTransaction().commit();

			System.out.println("Done! ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
