package com.cg.MovieTicketBookingApp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TICKETBOOKING")
public class TicketBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tickets_id")
	private int ticketId;
	
	@Column(name="show_id")
	private int showId;
	
	@Column(name="booking_date")
	private LocalDate bookingDate;
	
	@Column(name="transaction_id")
	private int transactionId;
	
	@Column(name="transaction_mode")
	private String transactionMode;
	
	@Column(name="transaction_status")
	private String transactionStatus;
	
	@Column(name="total_cost")
	private double totalCost;
	
	@OneToOne(targetEntity=Ticket.class)
	private Ticket ticket;
	
	public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketBooking(int ticketId, int showId, LocalDate bookingDate, int transactionId, String transactionMode,
			String transactionStatus, double totalCost, Ticket ticket) {
		super();
		this.ticketId = ticketId;
		this.showId = showId;
		this.bookingDate = bookingDate;
		this.transactionId = transactionId;
		this.transactionMode = transactionMode;
		this.transactionStatus = transactionStatus;
		this.totalCost = totalCost;
		this.ticket = ticket;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionMode() {
		return transactionMode;
	}
	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
}
