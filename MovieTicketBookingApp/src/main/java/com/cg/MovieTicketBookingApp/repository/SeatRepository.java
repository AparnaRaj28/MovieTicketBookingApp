package com.cg.MovieTicketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.MovieTicketBookingApp.model.Seat;
@Repository
public interface SeatRepository extends JpaRepository<Seat,Integer> {

}
