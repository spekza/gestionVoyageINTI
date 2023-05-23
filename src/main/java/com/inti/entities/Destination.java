package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DESTINATIONS", schema = "gestion_voyage_db")
public class Destination implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestination;
	private Long longitude;
	private Long Latitude;
	
	@OneToMany(mappedBy="destination")
	private List<Hotel> hotels = new ArrayList<>();

	public Destination() {
	}

	public Destination(Long longitude, Long latitude, List<Hotel> hotels) {
		this.longitude = longitude;
		Latitude = latitude;
		this.hotels = hotels;
	}

	public Long getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(Long idDestination) {
		this.idDestination = idDestination;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return Latitude;
	}

	public void setLatitude(Long latitude) {
		Latitude = latitude;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	@Override
	public String toString() {
		return "Destination [idDestination=" + idDestination + ", longitude=" + longitude + ", Latitude=" + Latitude
				+ "]";
	}
	
	
}
