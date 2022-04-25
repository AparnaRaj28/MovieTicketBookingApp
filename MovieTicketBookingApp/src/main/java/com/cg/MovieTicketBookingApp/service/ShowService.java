package com.cg.MovieTicketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.repository.ShowRepository;

@Service
public class ShowService {

	@Autowired
	ShowRepository repository;
}
