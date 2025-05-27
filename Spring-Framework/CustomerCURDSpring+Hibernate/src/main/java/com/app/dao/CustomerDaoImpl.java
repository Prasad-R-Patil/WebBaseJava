package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomer() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = currentSession.createQuery("From Customer order by lastName", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
		
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.merge(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theID) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer thCustomer = currentSession.get(Customer.class, theID);
		
		return thCustomer;
	}
	
	

}
