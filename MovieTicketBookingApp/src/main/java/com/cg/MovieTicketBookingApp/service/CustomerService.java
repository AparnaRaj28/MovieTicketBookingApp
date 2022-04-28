package com.cg.MovieTicketBookingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.repository.CustomerRepository;

@Service
public interface CustomerService {

	List<Customer> ViewAllCustomer();
		
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(int id);
	
	Customer updateCustomer(Customer customer);
	
	void deleteCustomerById(int id);
//	@Autowired
//	private CustomerRepository cust_repo;
//	
//	public List<Customer> ViewAllCustomer()
//	{
//		return (List<Customer>)cust_repo.findAll();
//	}
}
