package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;


public class App {
	
	private static final Object Patil = null;

	public static void main(String[] args) {
		
		// 1. Create Session Factory
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		// 2. Create Session
		
		Session session = factory.openSession();
		
		// 3. Begin Transaction
		
		session.beginTransaction();
/*
		// 4. Save The Entity
		
		Student s = new Student();
		
		s.setFirstName("Prasad");
		s.setLastName("Patil");
		s.setEmail("prasad@gamil.com");

		session.save(s);

		
		// # Get Entity on Basis of Id
		
		Scanner s = new Scanner(System.in);
		int id;
		System.out.println("Enter Student Id");
		id = s.nextInt();
		
		Student student = session.get(Student.class, id);
		System.out.println(student);
	
		// Update Student
		
		Scanner s = new Scanner(System.in);
		int id;
		System.out.println("Enter Student Id");
		id = s.nextInt();
		
		Student student = session.get(Student.class, id);
		System.out.println(student);
		student.setEmail("Patil01@gmail.com");
		session.update(student);
		
		System.out.println(student);
		
			
		
		// Delete Student
		
		Scanner s = new Scanner(System.in);
		int id;
		System.out.println("Enter Student Id");
		id = s.nextInt();
		
		Student student = session.get(Student.class, id);
		System.out.println(student);
		
		session.delete(student);
		
		
		
		// List of Student
		
		Query query = session.createQuery("from Student ");
		
		List<Student> l=query.list();
		l.forEach(x -> System.out.println(x));
		
*/		
		// List of Student Using last name
		
				Query query = session.createQuery("from Student where lastName = :name ");
				
				query.setParameter("name", "Patil");
				List<Student> l=query.list();
				l.forEach(x -> System.out.println(x));
		
		
		
		
		
		
		
		// 5. Commit
		
		session.getTransaction().commit();
		
		// 6. close the Session
		
		session.close();
		
		// 7. close the Factory
		
		factory.close();
	
	
	}

}
