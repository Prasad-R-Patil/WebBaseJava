package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetails.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {
            // Create objects
            InstructorDetails instructorDetails = new InstructorDetails("SemiSoft", "Play-Boy");
            Instructor instructor = new Instructor("Prasad", "Patil", "patil@gmail.com");

            // Associate
            instructor.setInstructorDetails(instructorDetails);

            // Start transaction
            session.beginTransaction();

            // Save instructor (cascades to instructorDetails)
            session.persist(instructor);

            // Commit transaction
            session.getTransaction().commit();
            System.out.println("Instructor and InstructorDetails saved successfully.");

        } finally {
            session.close();
            factory.close();
        }
    }
}
