package com.cg.MovieTicketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.MovieTicketBookingApp.model.Shows;

//@Repository
public interface ShowRepository extends JpaRepository<Shows,String>{

}
