package com.cg.MovieTicketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.MovieTicketBookingApp.model.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
