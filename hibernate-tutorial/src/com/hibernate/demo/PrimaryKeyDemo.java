package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
						.buildSessionFactory();

				Session session = factory.getCurrentSession();

				try {
					// create 3 student object
					System.out.println("Creating 3 student object...");
					Student tempStudent1 = new Student("Can", "Doe", "paul@luv2code.com");
					Student tempStudent2 = new Student("Mary", "Public", "paul@luv2code.com");
					Student tempStudent3 = new Student("Bonita", "Doe", "paul@luv2code.com");

					// start a transaction
					session.beginTransaction();

					// save the student object
					System.out.println("Saving the student...");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);

					// commit transaction
					session.getTransaction().commit();

					System.out.println("Done!");
				} finally {
					factory.close();
				}

			}
	}

// alter table hb_student_tracker.student AUTO_INCREMENT=3000 ; auto increment value
// truncate hb_student_tracker.student ; tüm veriyi siler ve auto incrementi 0 yapar.

