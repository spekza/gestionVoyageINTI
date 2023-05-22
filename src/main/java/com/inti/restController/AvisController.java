package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inti.entities.Avis;
import com.inti.services.interfaces.IAvisService;

public class AvisController {
	
	@Autowired
	IAvisService avisService;
	
	@RequestMapping(value = "avis", method = RequestMethod.GET)
	public List<Avis> findAll(){
		return avisService.findAll();
	}
	
	@RequestMapping(value = "avis/{idV}", method=RequestMethod.GET)
	public Avis findOne(@PathVariable("idV") Long id) {
		return avisService.findOne(id);
	}
	
	@RequestMapping(value = "avis", method=RequestMethod.POST)
	public Avis saveAvis(@RequestBody Avis avis) {
		return avisService.save(avis);
	}
	
	@RequestMapping(value = "avis/{idA}", method=RequestMethod.DELETE)
	public void deleteAvis(@PathVariable("idA") Long id) {
		avisService.delete(id);
	}
	
	@RequestMapping(value = "avis/{idA}", method=RequestMethod.PUT)
	public Avis updateAvis(@PathVariable("idA") Long id,@RequestBody Avis avis) {
		Avis currentAvis = avisService.findOne(id);
		currentAvis.setCommentaire(avis.getCommentaire());
		return avisService.save(currentAvis);
	}

}
