package com.cg.MovieTicketBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.repository.CustomerRepository;
import com.cg.MovieTicketBookingApp.repository.UserRepository;
import com.cg.MovieTicketBookingApp.service.CustomerService;

@RestController
public class ApplicationController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserRepository user_repo;
	
	@Autowired
	private CustomerRepository customer_repo;
	
//	@Autowired
//	private CustomerService cust_service;
	
	@GetMapping("/")
	public ModelAndView homepage() 
	{
		return new ModelAndView("home");
	}
	
	@GetMapping("/register")
	public ModelAndView registration(Model model)
	{
		model.addAttribute("user",User.class);
		return new ModelAndView("register");
	}
	
	@GetMapping("/login")
	public ModelAndView login()
	{
		return new ModelAndView("login");
	}
	
	@PostMapping("/process_register")
	public ModelAndView processRegistration(Customer customer,User user)
	{
		//User u=new User();
		//u.setRole("Customer");
		user_repo.save(user);
		customer_repo.save(customer);
		return new ModelAndView("success");
	}
	
//	   @GetMapping("/viewcustomer")
//	   public ModelAndView ViewCustomers(Model m)
//		{
//		   ModelAndView mav = new ModelAndView("ViewCutomers");
//		    List<Customer> customer=cust_service.ViewAllCustomer();
//		    mav.addObject("customer",customer);
//		    return mav;
//		}
   
}