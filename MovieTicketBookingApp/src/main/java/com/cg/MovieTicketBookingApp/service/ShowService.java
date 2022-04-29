package com.cg.MovieTicketBookingApp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Shows;
import com.cg.MovieTicketBookingApp.repository.ShowRepository;

//import com.cg.MovieTicketBookingApp.repository.ShowRepository;

@Service
public class ShowService {

	
	/*Shows addShow(Shows show);
	Shows updateShows(Shows show);
	Shows removeShows(Shows show);
	Shows viewShows(Shows show);
	List<Shows> viewShowList(int theatreId);
	List<Shows> viewShowList(LocalDate date);
	List<Shows> viewAllShows();*/
	@Autowired
	ShowRepository repository;
	void updateShows(Shows show)
	{
		repository.save(show);
	}
	void removeShows(Shows show)
	{
		repository.delete(show);
	}

	List<Shows> viewShowList(int theatreId)
	{
		List<Shows> list=repository.findAll();
		list=list.stream().filter(shows->shows.getTheatreId()==theatreId).collect(Collectors.toList());
		return list;
	}
	List<Shows> viewAllShows()
	{
		List<Shows> list=repository.findAll();
		return list;
	}
}
