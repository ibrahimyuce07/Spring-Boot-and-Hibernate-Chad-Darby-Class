package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {

		// 1 create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// 2 create session
		Session session = factory.getCurrentSession();

		try {
			
			// start a transaction
			session.beginTransaction();

			//get instructor by primary key(id)
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId); //will return null if not found, check this.
			
			System.out.println("Found instructor : "+tempInstructor);
			
			//delete the instructor
			if (tempInstructor != null) {
				System.out.println("Deleting: " +tempInstructor);
				//note: will also delete associated "details" object (cascade ALL)
				session.delete(tempInstructor);
			}
			
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}

	}
}
