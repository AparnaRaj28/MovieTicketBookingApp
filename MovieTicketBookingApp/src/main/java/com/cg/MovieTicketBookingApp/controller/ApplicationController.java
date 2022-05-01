package com.cg.MovieTicketBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.repository.CustomerRepository;
import com.cg.MovieTicketBookingApp.repository.UserRepository;
import com.cg.MovieTicketBookingApp.service.CustomerService;
import com.cg.MovieTicketBookingApp.service.UserService;

@RestController
public class ApplicationController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserRepository user_repo;
	
	@Autowired
	private CustomerRepository customer_repo;
	
	@Autowired
	private UserService user_service;
	
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
	public ModelAndView getloginForm()
	{
		return new ModelAndView("login");
	}
	
	//checking for login credentials//
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("users") User user,Model model )
	{
		String username=user.getEmail();
		String password=user.getPassword();
		List<User> userlist= user_service.GetAllUser();
		
		if(username.equals("admin") && password.equals("admin"))
		{
			return new ModelAndView("admin/adminhome");
			// return "redirect:/adminhome";
		}
			 
		
		  for(User u:userlist)
		  {
			  if(u.getEmail().equals(username) && u.getPassword().equals(password))
			  {
				 return new ModelAndView("Customer/userhome");
				// return "redirect:/userhome";
				  
			  }
			  //System.out.println(c.getCustomerId());
		  }
		//model.addAttribute("Invalid credentials",true);
		return new ModelAndView("invalid");
		 //return "redirect:/invalid";
		
	}
	
	@GetMapping("/invalid")
	public ModelAndView InvalidLogin()
	{
		return new ModelAndView("invalid");
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
	
	@GetMapping("/logout")
	public ModelAndView signout()
	{
		
		return new ModelAndView("login");
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