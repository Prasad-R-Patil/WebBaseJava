package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Book;

public class BookDAO {
	
	public static int saveBook(Book s)
	{
		SessionFactory  factory =null;
		Session session =null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
			session = factory.openSession();
			
			session.beginTransaction();
			
			int id=(int) session.save(s);	
			//session.persist(s);
			
			session.getTransaction().commit();
			
			return id;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		return 0;
	}
	
	public  Book getBook(int id)
	{
		SessionFactory  factory =null;
		Session session =null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
			session = factory.openSession();
			
			session.beginTransaction();
			
			//int id=(int) session.save(s);	
			//session.persist(s);
			Book bk= session.get(Book.class, id);
			session.getTransaction().commit();
			
			return bk;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
			factory.close();
		}
		
	}
	
	public static int updateBook(Book s,int id)
	{
		SessionFactory  factory =null;
		Session session =null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
			session = factory.openSession();
			
			session.beginTransaction();
			
			//int id=(int) session.save(s);	
			//session.persist(s);
			Book bk= session.get(Book.class, id);
			
			bk.setTitel(s.getTitel());
			bk.setAurthor(s.getAurthor());
			bk.setPublisher(s.getPublisher());
			bk.setPrice(s.getPrice());
			
			session.update(bk);
			
			
			session.getTransaction().commit();
			
			return id;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		return 0;
	}
	
	public static Book deleteBook(int id)
	{
		SessionFactory  factory =null;
		Session session =null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
			session = factory.openSession();
			
			session.beginTransaction();
			
			//int id=(int) session.save(s);	
			//session.persist(s);
			Book bk= session.get(Book.class, id);
			
		
			
			session.delete(bk);
			
			
			session.getTransaction().commit();
			
			return bk;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if (session != null) {
		        session.close();
		    }
			factory.close();
		}
		return null;
	}

}
