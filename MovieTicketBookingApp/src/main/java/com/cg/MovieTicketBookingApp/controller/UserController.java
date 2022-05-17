package com.cg.MovieTicketBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.MovieTicketBookingApp.model.Theatre;
import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.repository.UserRepository;
import com.cg.MovieTicketBookingApp.service.MovieService;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class UserController 
{
	@Autowired
	private MovieService movie_service;
	
	@Autowired
	private UserRepository userRepo;
	
	/*@GetMapping("/userhome")
	public ModelAndView listMovie(Model model)
	{
		model.addAttribute("movies", movie_service.ViewAllMovie());
		return new ModelAndView("Customer/userhome");
    }*/
	
	@GetMapping("/userhome")
	public List<User> listUser()
	{
		return userRepo.findAll();	
	}
	
}
