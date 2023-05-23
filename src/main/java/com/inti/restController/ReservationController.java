package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Reservation;
import com.inti.services.interfaces.IReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	IReservationService reservationService;
	
	@RequestMapping(value = "employes", method = RequestMethod.GET)
	public List<Reservation> findAll(){
		return reservationService.findAll();
	}
}
