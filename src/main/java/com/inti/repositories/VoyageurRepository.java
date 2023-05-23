package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Voyageur;

@Repository
public interface VoyageurRepository extends JpaRepository<Voyageur, Long>{
	@Query(value="select * from voyageur")
	List<Voyageur> findAllVoyageurs();

}
