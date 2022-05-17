package com.cg.MovieTicketBookingApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Movie;
import com.cg.MovieTicketBookingApp.model.Theatre;

@Service
public interface TheatreService 
{
	List<Theatre> ViewAllTheatre();
	
	//List<Movie> getListOfMovies();
}
