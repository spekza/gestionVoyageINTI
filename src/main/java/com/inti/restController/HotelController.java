package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inti.entities.Hotel;
import com.inti.services.interfaces.IHotelService;

public class HotelController {
	@Autowired
	IHotelService hotelService;

	@RequestMapping(value = "hotel", method = RequestMethod.GET)
	public List<Hotel> findAll() {
		return hotelService.findAll();
	}

	@RequestMapping(value = "hotel/{idV}", method = RequestMethod.GET)
	public Hotel findOne(@PathVariable("idV") Long id) {
		return hotelService.findOne(id);
	}

	@RequestMapping(value = "hotel", method = RequestMethod.POST)
	public Hotel saveAvis(@RequestBody Hotel hotel) {
		return hotelService.save(hotel);
	}

	@RequestMapping(value = "hotel/{idA}", method = RequestMethod.DELETE)
	public void deleteAvis(@PathVariable("idA") Long id) {
		hotelService.delete(id);
	}

	
}
