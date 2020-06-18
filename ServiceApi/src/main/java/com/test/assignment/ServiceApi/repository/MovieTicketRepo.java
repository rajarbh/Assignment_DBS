package com.test.assignment.ServiceApi.repository;

import org.springframework.stereotype.Repository;

import com.test.assignment.ServiceApi.model.CustomerDetail;

@Repository
public class MovieTicketRepo {

	public CustomerDetail getMovieTicket(CustomerDetail cust) {
		calculateFare(cust);
		return cust; 
	}
	
	private void calculateFare(CustomerDetail cust) {
		
		cust.setFare(String.valueOf((Integer.valueOf(cust.getAge())*2)));
		
		
	}
}
