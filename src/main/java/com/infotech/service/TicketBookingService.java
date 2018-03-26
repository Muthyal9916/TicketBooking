package com.infotech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.dao.TicketBookingDao;
import com.infotech.entites.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	public TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}


	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}


	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.delete(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String email) {
		Ticket ticketfromDB = ticketBookingDao.findOne(ticketId);
		ticketfromDB.setEmail(email);
		Ticket updatedTicket = ticketBookingDao.save(ticketfromDB);
		return updatedTicket;
	}
	
	

}
