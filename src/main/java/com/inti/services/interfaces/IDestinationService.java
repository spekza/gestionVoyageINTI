package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Destination;

public interface IDestinationService {
	List<Destination> findAll();

	Destination findOne(Long id);

	Destination save(Destination destination);

	void delete(Long id);
}
