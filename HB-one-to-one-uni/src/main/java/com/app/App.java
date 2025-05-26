package com.app;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;
import com.mysql.cj.jdbc.interceptors.SessionAssociationInterceptor;

public class App {
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetails.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {
            // 1. Create objects// Save Details
        	
          /*  InstructorDetails instructorDetails = new InstructorDetails("SemiSoft", "Play-Boy");
              Instructor instructor = new Instructor("Prasad", "Patil", "patil@gmail.com");
           */   
            /* 
        	InstructorDetails instructorDetails = new InstructorDetails("hello", "Play-Boy");
            Instructor instructor = new Instructor("jon", "Patil", "patil@gmail.com");

            instructor.setInstructorDetails(instructorDetails);

            session.beginTransaction();

            session.persist(instructor);
            
            session.getTransaction().commit();
            System.out.println("Instructor and InstructorDetails saved successfully.");
       */
            
            // 2. instructor find detail basis on id
       /*     
            
            System.out.println("Enter Instructor Id");
            int id = s.nextInt();
            
            Instructor instructor = session.get(Instructor.class, id);
            
            System.out.println(instructor);
            
         */
        /*	
        	// 3.  Update the Instructor
        	
        	 System.out.println("Enter Instructor Id");
             int id = s.nextInt();
            
             Instructor instructor = session.get(Instructor.class, id);
             
             instructor.setFirstName("divakar");
             instructor.setEmail("diva@gmail.com");
             instructor.getInstructorDetails().setYoutubeChannel("divar");
             Instructor i = session.merge(instructor);
             
             System.out.println("i = "+i);
            
             session.beginTransaction().commit();
             System.out.println("Instructor and InstructorDetails Update successfully.");
           */
        	
        	// 4. Delete The Instructor
       /*
        	System.out.println("Enter Instructor Id");
            int id = s.nextInt();
           
            Instructor instructor = session.get(Instructor.class, id);
            
            session.remove(instructor);
            session.beginTransaction().commit();
            System.out.println("Instructor and InstructorDetails Deleted successfully.");
        	
        */
        	
        	List<Instructor> l =  session.createQuery("From Instructor").list();
        	
        	Predicate<Instructor> p = x-> x.getInstructorDetails().getYoutubeChannel().equals("divar");
        	
        	l.forEach(x->{
        		
        	if(p.test(x))
        	  System.out.println(x);	
        	});
        	
        	session.beginTransaction().commit();
            System.out.println("Instructor and InstructorDetails Find successfully.");
        	

        } 
        finally 
        {
            session.close();
            factory.close();
        }
    }
}
