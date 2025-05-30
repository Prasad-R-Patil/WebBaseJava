package com.app.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	public SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		Query<Customer> query = session.createQuery("from Customer order by lastName",Customer.class);
		
		List<Customer> customers = query.getResultList();
		return customers;
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class,id);
		return customer;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.merge(theCustomer);
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		session.remove(customer);
		
		
	}
	

}
