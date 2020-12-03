package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {

		// 1 create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// 2 create session
		Session session = factory.getCurrentSession();

		try {
			//create the object
			
			Instructor tempIstructor = new Instructor("ibrahim", "yuce", "yuce@luv2code.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/greatech", "Luv 2 code!!!");
			
			//associate the objects!!!!
			tempIstructor.setInstructorDetail(tempInstructorDetail);
			
			// start a transaction
			session.beginTransaction();

			//save the instructor
			//note: this will also save the details object because of cascade type ALL
			
			System.out.println("Saving instructor: " + tempIstructor);
			session.save(tempIstructor);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}

	}
}
