package com.test.assignment.ServiceApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.assignment.ServiceApi.model.CustomerDetail;
import com.test.assignment.ServiceApi.service.MovieService;

@RestController
@RequestMapping("/service")
public class ServiceController {

	@Autowired 
	MovieService movieService;
	@RequestMapping(value="/movieticket", method=RequestMethod.POST)
	public CustomerDetail bookTicket(@RequestBody CustomerDetail data) {
		return movieService.getMovieticket(data);
	}
	
	
}
