package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Voyageur;
import com.inti.repositories.VoyageurRepository;
import com.inti.services.interfaces.IVoyageurService;

public class VoyageurService implements IVoyageurService{
	
	@Autowired
	VoyageurRepository voyageurRepository;

	@Override
	public List<Voyageur> findAll() {
		// TODO Auto-generated method stub
		return voyageurRepository.findAll();
	}

	@Override
	public Voyageur findOne(Long id) {
		// TODO Auto-generated method stub
		return voyageurRepository.findById(id).get();
	}

	@Override
	public Voyageur save(Voyageur e) {
		// TODO Auto-generated method stub
		return voyageurRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		voyageurRepository.deleteById(id);
		
	}

}
