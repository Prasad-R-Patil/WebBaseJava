package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private  EntityManager entityManager;

	@Override
	public List<Customer> getCustomers() {
		
		Query query = entityManager.createQuery("From Customer");
		 List<Customer> list = query.getResultList();
		return list;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Customer.class, id);
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Customer customer = entityManager.merge(theCustomer);
		
		theCustomer.setId(customer.getId());
		
	}

	@Override
	public Customer updateCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		return entityManager.merge(theCustomer);
	}

	@Override
	public void deleteCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		entityManager.remove(theCustomer);
	}


	

	
	
	

}
