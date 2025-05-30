package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDAO;
import com.app.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerById(id);
	}

	@Override
	 @Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer updateCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		return  customerDAO.updateCustomer(theCustomer);
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		 customerDAO.deleteCustomer(theCustomer);
	}

	

}
