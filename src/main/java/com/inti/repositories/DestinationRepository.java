package com.inti.repositories;

import javax.print.attribute.standard.Destination;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long>{

	Destination findByIdDestination(Long idDestination);
}
