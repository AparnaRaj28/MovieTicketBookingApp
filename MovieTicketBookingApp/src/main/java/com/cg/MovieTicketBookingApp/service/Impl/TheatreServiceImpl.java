package com.cg.MovieTicketBookingApp.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Movie;
import com.cg.MovieTicketBookingApp.model.Theatre;
import com.cg.MovieTicketBookingApp.repository.MovieRepository;
import com.cg.MovieTicketBookingApp.repository.TheatreRepository;
import com.cg.MovieTicketBookingApp.service.TheatreService;

@Service
public class TheatreServiceImpl implements TheatreService
{
    private TheatreRepository theatre_repo;
    
//    private MovieRepository movie_repo;
	
	
//	public TheatreServiceImpl(MovieRepository movie_repo) {
//		super();
//		this.movie_repo = movie_repo;
//	}


	public TheatreServiceImpl(TheatreRepository theatre_repo) {
		super();
		this.theatre_repo = theatre_repo;
	}


	@Override
	public List<Theatre> ViewAllTheatre() {
		return theatre_repo.findAll();
	}


//	@Override
//	public List<Movie> getListOfMovies() {
//         
//		return movie_repo.findAll();
//		      
//	}

}
