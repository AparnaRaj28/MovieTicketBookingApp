package com.cg.MovieTicketBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cg.MovieTicketBookingApp.repository.CustomerRepository;

@SpringBootApplication
public class MovieTicketBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingAppApplication.class, args);
	}

}
