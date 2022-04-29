package com.cg.MovieTicketBookingApp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.service.CustomerService;
import com.cg.MovieTicketBookingApp.service.UserService;

@Controller
public class AdminController {

	private CustomerService cust_service;

	private UserService user_service;

	public AdminController(CustomerService cust_service) {
		super();
		this.cust_service = cust_service;
	}

	 @GetMapping("/adminhome")
	 public ModelAndView AdminHome()
	 {
		 
		 return new ModelAndView("admin/adminhome");
	 }

	 @RequestMapping("/adminheader")
	 public ModelAndView AdminHeader()
	 {
		 
		 return new ModelAndView("admin/adminheader");
	 }
	 
	@GetMapping("/viewcustomers")
	public ModelAndView listCustomer(Model model) {
//	  List<Customer> custlist= cust_service.ViewAllCustomer();
//	  for(Customer c:custlist)
//	  {
//		  System.out.println(c.getCustomerId());
//	  }
		model.addAttribute("customers", cust_service.ViewAllCustomer());
		return new ModelAndView("admin/ViewCustomers");

	}

	@GetMapping("/viewcustomers/addcustomer")
	public ModelAndView createCustomerForm(Model model) {

		Customer customer = new Customer();// to hold customer form data
		User user = new User();
		model.addAttribute("customers", customer);
		model.addAttribute("users", user);
		return new ModelAndView("admin/addCustomer");
	}

	@PostMapping("/viewcustomers")
	public String saveCustomer(@ModelAttribute("customers") Customer customer) {
		cust_service.saveCustomer(customer);

		return "redirect:/viewcustomers";
	}
	
	//handling update request
	
	@GetMapping("/viewcustomers/edit/{id}")
	public ModelAndView editCustomerForm(@PathVariable int id,Model model)
	{
		model.addAttribute("customers",cust_service.getCustomerById(id));
		return new ModelAndView("admin/editCustomer");
	
	}
	
	@PostMapping("/viewcustomers/{id}")
	public String updateCustomer(@PathVariable int id,
			@ModelAttribute("customers") Customer customer,
			Model model){
		 
		//get customer from database ny if
		Customer existingcustomer=cust_service.getCustomerById(id);
		existingcustomer.setCustomerId(id);
		existingcustomer.setCustomerName(customer.getCustomerName());
		existingcustomer.setAddress(customer.getAddress());
		existingcustomer.setMobileNumber(customer.getMobileNumber());
		existingcustomer.setEmail(customer.getEmail());
		//existingcustomer.setPassword();
		cust_service.updateCustomer(existingcustomer);
		return "redirect:/viewcustomers";
	}
  
	//handling delete request
	
	@GetMapping("/viewcustomers/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		cust_service.deleteCustomerById(id);
		return "redirect:/viewcustomers";
	}

}