package com.inti.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.entities.Hotel;

@Service
public interface IHotelService {
	List<Hotel> findAll();

	Hotel findOne(Long id);

	Hotel save(Hotel hotel);

	void delete(Long id);
}
