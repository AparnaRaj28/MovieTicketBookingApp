package com.cg.MovieTicketBookingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MovieTicketBookingApp.model.Customer;
import com.cg.MovieTicketBookingApp.model.User;
import com.cg.MovieTicketBookingApp.repository.UserRepository;

@Service
public class UserService {

	
	//User addNewUser(User user);
	//User signIn(User user);
	//User signOut(User user);
	
	@Autowired
	UserRepository user_repo;;
	
	void addNewUser(User user)
	{
		user_repo.save(user);
	}
	void signIn(User user)
	{
		user_repo.save(user);
	}
	
	public List<User> GetAllUser()
	{
		return user_repo.findAll(); 
	}
	
//	public User signIn(String username,String password)
//	{
//		User user=user_repo.findByUsernameAndPassword(username,password);
//		return user;
//	}
}
