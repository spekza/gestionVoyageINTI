package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HOTELS", schema = "gestion_voyage_db")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHotel;
	private String nom;
	private int nbEtoile;

	@ManyToOne
	@JoinColumn(name = "idDestination")
	private Destination destination;

	@OneToMany
	@JoinColumn(name = "idAvis")
	private Avis avis;

	@OneToMany
	@JoinColumn(name = "idReservation")
	private Reservation reservation;

	public Hotel() {

	}

	public Hotel(String nom, int nbEtoile, Destination destination, Avis avis, Reservation reservation) {

		this.nom = nom;
		this.nbEtoile = nbEtoile;
		this.destination = destination;
		this.avis = avis;
		this.reservation = reservation;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Avis getAvis() {
		return avis;
	}

	public void setAvis(Avis avis) {
		this.avis = avis;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nom=" + nom + ", nbEtoile=" + nbEtoile + ", avis=" + avis + "]";
	}
	

}
