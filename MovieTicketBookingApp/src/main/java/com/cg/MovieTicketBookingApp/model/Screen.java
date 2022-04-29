package com.cg.MovieTicketBookingApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SCREEN")
public class Screen {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="screen_id")
	private int screenId;
	
	@Column(name="theatre_id")
	private int theatreId;
	
	@Column(name="screen_name")
	private String screenName;
	
	@OneToMany(mappedBy="showId", cascade=CascadeType.ALL)
	private List<Shows> showList;
	
	@Column(name="rows")
	private int rows;
	
	@Column(name="columns")
	private int columns;
	
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Screen(int screenId, int theatreId, String screenName, List<Shows> showList, int rows, int columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.rows = rows;
		this.columns = columns;
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
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public List<Shows> getShowList() {
		return showList;
	}
	public void setShowList(List<Shows> showList) {
		this.showList = showList;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}
