package com.cg.MovieTicketBookingApp.service;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Movie;
import com.cg.MovieTicketBookingApp.repository.MovieRepository;

//import com.cg.MovieTicketBookingApp.repository.MovieRepository;

@Service
public class MovieService {

	
	/*Movie addMovie(Movie movie);
	Movie updateMovie(Movie movie);
	Movie removeMovie(int movieId);
	Movie viewMovie(int movieid);
	List<Movie> viewMovieList();
	List<Movie> viewMovieList(int theatreId);
	List<Movie> viewMovieList(LocalDate date);*/
	
	@Autowired
	MovieRepository repository;
	void addMovie(Movie movie)
	{
		repository.save(movie);
	}
	void updateMovie(Movie movie)
	{
		repository.save(movie);
	}
	void removeMovie(String movieId)
	{
		repository.deleteById(movieId);
	}
	
	List<Movie> viewMovieList()
	{
		List<Movie> list=repository.findAll();
		return list;
	}
	//List<Movie> viewMovieList(String theatreId)
	//{
		//List<Movie> list=repository.findAll();
		//list=list.stream().filter(movie->movie.getMovieId().equals(theatreId).collect(Collectors.toList()));
		//return list;
	//}
}
 
