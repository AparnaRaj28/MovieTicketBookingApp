package com.cg.MovieTicketBookingApp.service;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.model.Movie;
import com.cg.MovieTicketBookingApp.repository.MovieRepository;

//import com.cg.MovieTicketBookingApp.repository.MovieRepository;

@Service
public interface MovieService {

	List<Movie> ViewAllMovie();
	
	Movie saveMovie(Movie movie);
	
	Movie getMovieById(int id);
	
	Movie updateMovie(Movie movie);
	
	void deleteMovieById(int id);
	
}
 
