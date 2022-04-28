package com.cg.MovieTicketBookingApp.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.repository.CustomerRepository;
import com.cg.MovieTicketBookingApp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{
	
	private CustomerRepository cust_repo;

	public CustomerServiceImpl(CustomerRepository cust_repo) {
		super();
		this.cust_repo = cust_repo;
	}
	
	@Override
	public List<Customer> ViewAllCustomer()
	{
		return cust_repo.findAll(); 
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return cust_repo.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return cust_repo.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return cust_repo.save(customer);
	}

	@Override
	public void deleteCustomerById(int id) {
		cust_repo.deleteById(id);
		
	}



}
