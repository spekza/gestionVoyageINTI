package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long>{

	Destination findByIdDestination(Long idDestination);
}
