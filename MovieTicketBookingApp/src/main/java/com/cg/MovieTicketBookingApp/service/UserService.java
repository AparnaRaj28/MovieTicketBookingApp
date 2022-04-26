package com.cg.MovieTicketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository user_repo;
	
//	public User signIn(String username,String password)
//	{
//		User user=user_repo.findByUsernameAndPassword(username,password);
//		return user;
//	}
}
