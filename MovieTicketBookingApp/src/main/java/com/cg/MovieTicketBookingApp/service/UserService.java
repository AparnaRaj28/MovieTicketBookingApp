package com.cg.MovieTicketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
}
