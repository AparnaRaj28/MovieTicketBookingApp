package com.cg.MovieTicketBookingApp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SHOWS1")

public class Shows {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="show_id")
	private String showId;
	
	@Column(name="show_start_time")
	private LocalDateTime showStartTime;
	
	@Column(name="show_end_time")
	private LocalDateTime showEndTime;
	
	@Column(name="show_name")
	private String showName;
	
	@OneToOne(targetEntity=Movie.class)
	private Movie movie;
	
	@Column(name="screen_id")
	private int screenId;
	
	@Column(name="theatre_id")
	private int theatreId;
	
	public Shows() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shows(String showId, LocalDateTime showStartTime, LocalDateTime showEndTime, String showName, Movie movie,
			int screenId, int theatreId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.movie = movie;
		this.screenId = screenId;
		this.theatreId = theatreId;
	}
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
}
