package com.inti.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.entities.Avis;

@Service
public interface IAvisService {
	List<Avis> findAll();

	Avis findOne(Long id);

	Avis save(Avis avis);

	void delete(Long id);
	
}
