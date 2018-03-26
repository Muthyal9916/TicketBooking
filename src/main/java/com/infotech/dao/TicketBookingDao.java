package com.infotech.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.entites.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{
	

}
