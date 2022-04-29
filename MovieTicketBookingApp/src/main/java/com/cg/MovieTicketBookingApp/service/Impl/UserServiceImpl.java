package com.cg.MovieTicketBookingApp.service.Impl;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.repository.UserRepository;
import com.cg.MovieTicketBookingApp.service.UserService;

public class UserServiceImpl extends UserService{

	private UserRepository user_repo;
	
	public UserServiceImpl(UserRepository user_repo) {
		super();
		this.user_repo = user_repo;
	}
//	@Override
//	public User saveUser(User user) {
//	     return user_repo.save(user);
//	}


}
