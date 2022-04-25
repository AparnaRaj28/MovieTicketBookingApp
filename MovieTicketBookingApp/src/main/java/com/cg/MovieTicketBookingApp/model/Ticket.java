package com.cg.MovieTicketBookingApp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TICKET")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private int ticketId;
	
	@Column(name="no_of_seats")
	private int noOfSeats;
	
	@Column(name="seat_number")
	private List<Seat> seatNumber;
	
<<<<<<< HEAD
=======
	@Column(name="booking_ref")
>>>>>>> branch 'master' of https://github.com/AparnaRaj28/MovieTicketBookingApp.git
	private TicketBooking bookingRef;
	
<<<<<<< HEAD
=======
	@Column(name="ticket_status")
>>>>>>> branch 'master' of https://github.com/AparnaRaj28/MovieTicketBookingApp.git
	private boolean ticketStatus;
	
	public Ticket() {
		
	}
	public Ticket(int ticketId, int noOfSeats, List<Seat> seatNumber, TicketBooking bookingRef, boolean ticketStatus) {
		
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatNumber = seatNumber;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public List<Seat> getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(List<Seat> seatNumber) {
		this.seatNumber = seatNumber;
	}
	public TicketBooking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(TicketBooking bookingRef) {
		this.bookingRef = bookingRef;
	}
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
}
