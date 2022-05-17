package com.cg.MovieTicketBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.model.Theatre;
import com.cg.MovieTicketBookingApp.repository.TheatreRepository;
import com.cg.MovieTicketBookingApp.service.MovieService;
import com.cg.MovieTicketBookingApp.service.TheatreService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TheatreController 
{
	@Autowired
	private TheatreService theatre_service;
	
	@Autowired
	private MovieService movie_service;
	
	@Autowired
	private TheatreRepository theatre_repo;
	
//	@GetMapping("/viewtheatre")
//	public ModelAndView listTheatre(Model model)
//	{
//		model.addAttribute("theatres", theatre_service.ViewAllTheatre());
//		model.addAttribute("movies",movie_service.ViewAllMovie());
//		return new ModelAndView("admin/viewtheatre");
//    }
	
	@GetMapping("/viewtheatre")
	public List<Theatre> listTheatre()
	{
		return theatre_repo.findAll();	
	}

}
