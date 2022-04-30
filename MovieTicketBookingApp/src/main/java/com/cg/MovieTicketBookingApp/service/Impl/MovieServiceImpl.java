package com.cg.MovieTicketBookingApp.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Movie;
import com.cg.MovieTicketBookingApp.repository.MovieRepository;

import com.cg.MovieTicketBookingApp.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService
{
	
	private MovieRepository movie_repo;


	public MovieServiceImpl(MovieRepository movie_repo) {
		super();
		this.movie_repo = movie_repo;
	}
	
	@Override
	public List<Movie> ViewAllMovie() 
	{
		return movie_repo.findAll();
	}

	@Override
	public Movie saveMovie(Movie movie) 
	{
		return movie_repo.save(movie);
	}

	@Override
	public Movie getMovieById(int id)
	{
		
		return movie_repo.findById(id).get();
	}

	@Override
	public Movie updateMovie(Movie movie) 
	{
		return movie_repo.save(movie);
	}

	@Override
	public void deleteMovieById(int id) {
		movie_repo.deleteById(id);
		
	}



}
