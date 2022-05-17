package com.cg.MovieTicketBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.cg.MovieTicketBookingApp.model.Movie;
import com.cg.MovieTicketBookingApp.repository.MovieRepository;
import com.cg.MovieTicketBookingApp.service.MovieService;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class MovieController
{
	@Autowired
	private MovieService movie_service;
	
	@Autowired
	private MovieRepository movieRepo;
	
	/*@GetMapping("/viewmovie")
	public ModelAndView listMovie(Model model)
	{
		model.addAttribute("movies", movie_service.ViewAllMovie());
		return new ModelAndView("admin/viewmovie");
    }*/
	
	@GetMapping("/viewmovie")
	public List<Movie> listMovie()
	{
		return movieRepo.findAll();
	}

	@GetMapping("/viewmovie/addmovie")
	public ModelAndView createCustomerForm(Model model) {

		Movie movie = new Movie();// to hold customer form data
		model.addAttribute("movies", movie);
		return new ModelAndView("admin/addmovie");
	}
	
	@PostMapping("/viewmovie")
	public String saveCustomer(@ModelAttribute("movies") Movie movie) {
		movie_service.saveMovie(movie);

		return "redirect:/viewmovie";
	}
	

	
	
	//handling update request
	
	@GetMapping("/viewmovie/edit/{id}")
	public ModelAndView editMovieForm(@PathVariable int id,Model model)
	{
		model.addAttribute("movies",movie_service.getMovieById(id));
		return new ModelAndView("admin/editmovie");
	
	}
	
	@PostMapping("/viewmovie/{id}")
	public String updateMovie(@PathVariable int id,
			@ModelAttribute("movies") Movie movie,
			Model model){
		 
		//get customer from database ny if
		Movie existingmovie=movie_service.getMovieById(id);
		existingmovie.setMovieId(id);
		existingmovie.setMovieName(movie.getMovieName());
		existingmovie.setMovieGenre(movie.getMovieGenre());
		existingmovie.setMovieHours(movie.getMovieHours());
		existingmovie.setLanguage(movie.getLanguage());
		existingmovie.setDescription(movie.getDescription());		
		movie_service.updateMovie(existingmovie);
		return "redirect:/viewmovie";
	}
	
	 
		//handling delete request
		
		@GetMapping("/viewmovie/{id}")
		public String deleteCustomer(@PathVariable int id)
		{
			movie_service.deleteMovieById(id);
			return "redirect:/viewmovie";
		}
  
}
