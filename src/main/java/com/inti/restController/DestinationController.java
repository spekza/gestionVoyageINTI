package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Destination;
import com.inti.services.interfaces.IDestinationService;

@RestController
public class DestinationController {

	@Autowired
	IDestinationService destinationService;
	
	@RequestMapping(value = "destination", method = RequestMethod.GET)
	public List<Destination> findAll(){
		return destinationService.findAll();
	}
	
	@RequestMapping(value = "destination/{idV}", method=RequestMethod.GET)
	public Destination findOne(@PathVariable("idV") Long id) {
		return destinationService.findOne(id);
	}
	
	@RequestMapping(value = "destination", method=RequestMethod.POST)
	public Destination saveDestination(@RequestBody Destination destination) {
		return destinationService.save(destination);
	}
	
	@RequestMapping(value = "destination/{idD}", method=RequestMethod.DELETE)
	public void deleteDestination(@PathVariable("idD") Long id) {
		destinationService.delete(id);
	}
	
	@RequestMapping(value = "destination/{idD}", method=RequestMethod.PUT)
	public Destination updateDestination(@PathVariable("idD") Long id,@RequestBody Destination destination) {
		Destination currentDestination = destinationService.findOne(id);
		currentDestination.setLongitude(destination.getLongitude());
		currentDestination.setLatitude(destination.getLatitude());
		return destinationService.save(currentDestination);
	}
}
