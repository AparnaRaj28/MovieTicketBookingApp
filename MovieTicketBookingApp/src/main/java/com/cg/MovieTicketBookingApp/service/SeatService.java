package com.cg.MovieTicketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Seat;
import com.cg.MovieTicketBookingApp.repository.SeatRepository;

//import com.cg.MovieTicketBookingApp.repository.SeatRepository;

@Service
public class SeatService {

	
	//Seat bookSeat(Seat seat);
	//Seat cancelSeatBooking(Seat seat);
	//Seat blockSeat(Seat seat);
	
	@Autowired
	SeatRepository repository;
	void bookSeat(Seat seat)
	{
		repository.save(seat);
	}
	void cancelSeatBooking(Seat seat)
	{
		repository.delete(seat);
	}
	void blockSeat(Seat seat)
	{
		repository.delete(seat);
	}
}
