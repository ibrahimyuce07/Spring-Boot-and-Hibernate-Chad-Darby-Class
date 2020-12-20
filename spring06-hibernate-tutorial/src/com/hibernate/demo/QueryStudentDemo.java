package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// 1 create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// 2 create session
		Session session = factory.getCurrentSession();
		try {

			session.beginTransaction();

			 //query students
			List<Student> students = session.createQuery("from Student").getResultList();
			
			//display students
			displayStudents(students); //we extracted method
			
			// query students: lastName='Doe'
			students = session.createQuery("from Student s where s.lastName='Doe'").getResultList(); //lastName : java property name not column name
			System.out.println("\nStudents who have last name of Doe");
			displayStudents(students);
			

			//query students: lastName='Doe' OR firstname = 'Daffy'
			students = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Daffy'").getResultList();
			System.out.println("\nStudents who have last name of Doe OR firstname of Daffy");
			displayStudents(students);
			
			//query students: where email LIKE '%luv2code.com' ; %'den sonrası.
			students = session.createQuery("from Student s where s.email LIKE '%luv2code.com'").getResultList();
			System.out.println("\nStudents who have email ends with luv2code.com");
			displayStudents(students);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> students) {
		for(Student tempStudent : students) {
			System.out.println(tempStudent);
		}
	}
}


