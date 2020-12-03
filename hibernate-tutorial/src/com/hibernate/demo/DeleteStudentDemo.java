package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// 1 create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// 2 create session
		Session session = factory.getCurrentSession();

		try {

			int studentId = 1;

			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve the student based on the id:
			System.out.println("\nGetting student with id: " + studentId);

			Student myStudent = session.get(Student.class, studentId);

//			//delete the student
//			System.out.println("\nDeleting Student: " + myStudent);
//			session.delete(myStudent); 
			
			//delete student id=2
			System.out.println("\ndeleting student id=2: ");
			session.createQuery("delete from Student where id=2").executeUpdate();

			
		
			// commit transaction
			session.getTransaction().commit();

			
			
			
			System.out.println("Done!");
		} finally {
			factory.close();
		}

	}
}
