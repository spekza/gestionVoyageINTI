package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Voyageur;
import com.inti.services.interfaces.IVoyageurService;

@RestController
public class VoyageurController {
	@Autowired
	IVoyageurService VoyageurService;
	
	@RequestMapping(value = "Voyageurs", method = RequestMethod.GET)
	public List<Voyageur> findAll() {
		return VoyageurService.findAll();
	}
	@RequestMapping(value = "Voyageurs{id}", method = RequestMethod.GET)
	public Voyageur findOne(@PathVariable("id")Long id)
	{
		return VoyageurService.findOne(id);
	}
	@RequestMapping(value = "Voyageurs", method = RequestMethod.POST)
	public Voyageur saveVoyageur(@RequestBody Voyageur Voyageur)
	{
		return VoyageurService.save(Voyageur);
	}
	@RequestMapping(value = "Voyageurs/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id")Long id)
	{
		VoyageurService.delete(id);
	}
	@RequestMapping(value = "Voyageurs/{id}", method = RequestMethod.PUT)
	public Voyageur updateUtilisateur(@PathVariable("id")Long id, @RequestBody Voyageur Voyageur)
	{
		Voyageur current= VoyageurService.findOne(id);
		return Voyageur;
	}

}
