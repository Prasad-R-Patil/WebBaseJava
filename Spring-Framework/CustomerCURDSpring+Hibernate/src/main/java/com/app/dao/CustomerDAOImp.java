package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.entity.Customer;


public class CustomerDAOImp implements CustomerDAO{
	
	//need to injuct the session factory
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	public CustomerDAOImp(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create a query .. sort by last name
		Query<Customer> theQuery= currentSession.createQuery("from customer order by lastName",Customer.class);
		
		//execute query and get result list
		
		List<Customer> customers= theQuery.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		//get current hibernate session
		
		Session currentSession= sessionFactory.getCurrentSession();
		
		//save update the customer
		
		currentSession.merge(theCustomer);
		
		
	}

	@Override
	public Customer getCustomer(int theID) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrive read from database is id
		
		Customer theCustomer= currentSession.get(Customer.class, theID);
		
		return theCustomer;
	}

}
