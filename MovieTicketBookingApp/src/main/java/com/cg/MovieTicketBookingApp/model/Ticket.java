package com.cg.MovieTicketBookingApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TICKET")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticket_id")
	private int ticketId;
	
	@Column(name="no_of_seats")
	private int noOfSeats;
	
	@OneToMany(mappedBy="seatId", cascade=CascadeType.ALL)
	private List<Seat> seatNumber;
	
	
	@Column(name="ticket_status")
	private boolean ticketStatus;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int ticketId, int noOfSeats, List<Seat> seatNumber, boolean ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatNumber = seatNumber;

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
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
}
