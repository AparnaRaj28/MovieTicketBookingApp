package com.cg.MovieTicketBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.MovieTicketBookingApp.service.MovieService;

@Controller
public class UserController 
{
	@Autowired
	private MovieService movie_service;
	
	@GetMapping("/userhome")
	public ModelAndView listMovie(Model model)
	{
		model.addAttribute("movies", movie_service.ViewAllMovie());
		return new ModelAndView("Customer/userhome");
    }
}
