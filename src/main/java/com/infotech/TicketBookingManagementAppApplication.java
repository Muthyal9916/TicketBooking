package com.infotech;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.entites.Ticket;
import com.infotech.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication implements CommandLineRunner{
	
	@Autowired
	public TicketBookingService ticketBookingService;
	
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		
    SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestination("Marathalli");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("Muthu");
		ticket.setEmail("muthu@gmail.com");
		ticketBookingService.createTicket(ticket);
		
		System.out.println("DataSource "+dataSource);
	}
}
