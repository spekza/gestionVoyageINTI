package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Voyageur;



public interface IVoyageurService {
	List<Voyageur> findAll();

	Voyageur findOne(Long id);

	Voyageur save(Voyageur e);

	void delete(Long id);
	

}
