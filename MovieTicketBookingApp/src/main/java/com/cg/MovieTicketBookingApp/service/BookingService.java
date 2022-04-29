package com.cg.MovieTicketBookingApp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.TicketBooking;
import com.cg.MovieTicketBookingApp.repository.BookingRepository;

//import com.cg.MovieTicketBookingApp.repository.BookingRepository;

@Service
public class BookingService {

	/*TicketBooking addBooking(TicketBooking booking);
	TicketBooking updateBooking(TicketBooking booking);
	TicketBooking cancelBooking(TicketBooking booking);
	List<TicketBooking> showAllBooking(int movieId);
	List<TicketBooking> showAllBooking(LocalDate date);
	List<TicketBooking> showBookingList(int showId);
	double calculateTotalCost(int bookingId);*/
	@Autowired
	BookingRepository repository;
	void addBooking(TicketBooking booking)
	{
		repository.save(booking);
	}
	void updateBooking(TicketBooking booking)
	{
		repository.save(booking);
	}
	List<TicketBooking> showAllBooking(int movieId)
	{
		List<TicketBooking> list=repository.findAll();
		list=list.stream().filter(tb->tb.getShowId()==movieId).collect(Collectors.toList());
		return list;
	}
	List<TicketBooking> showAllBooking(LocalDate date)
	{
		List<TicketBooking> list=repository.findAll();
		list=list.stream().filter(tb->tb.getBookingDate()==date).collect(Collectors.toList());
		return list;
	}
	
	List<TicketBooking> showAllBookingList(int showId)
	{
		List<TicketBooking> list=repository.findAll();
		list=list.stream().filter(tb->tb.getTransactionId()==showId).collect(Collectors.toList());
		return list;
	}
	double calculateTotalCost(int bookingId)
	{
		List<TicketBooking> list=repository.findAll();
		list=list.stream().filter(tb->tb.getShowId()==bookingId).collect(Collectors.toList());
		double x=0;
		for(TicketBooking tb:list)
			x=tb.getTotalCost();
		return x;
	}
}
