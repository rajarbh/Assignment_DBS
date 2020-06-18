package com.test.assignment.ServiceApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.assignment.ServiceApi.model.CustomerDetail;
import com.test.assignment.ServiceApi.repository.MovieTicketRepo;

@Service
public class MovieService {

	@Autowired
	MovieTicketRepo movieTicketRepo;
	
	public CustomerDetail getMovieticket(CustomerDetail cust) {
		
		return movieTicketRepo.getMovieTicket(cust);
	}
}
