package com.cg.MovieTicketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.repository.UserRepository;

@Service
public class UserService {

	
	//User addNewUser(User user);
	//User signIn(User user);
	//User signOut(User user);
	
	@Autowired
	UserRepository repository;
	void addNewUser(User user)
	{
		repository.save(user);
	}
	void signIn(User user)
	{
		repository.save(user);
	}
	
//	public User signIn(String username,String password)
//	{
//		User user=user_repo.findByUsernameAndPassword(username,password);
//		return user;
//	}
}
