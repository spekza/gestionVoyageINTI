package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="VOYAGEUR", schema="gestion_voyage_db")

public class Voyageur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVoyageur;
	private String nom;
	private String prenom;
	private int age;
	
	@OneToMany(mappedBy="VOYAGEUR", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Reservation> reservation = new ArrayList<>();

	
	// Génération des constructeurs
	
	public Voyageur() {
		super();
	}


	public Voyageur(String nom, String prenom, int age, List<Reservation> reservation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.reservation = reservation;
	}

	// Génération des Getter et Setter
	
	
	public Long getIdVoyageur() {
		return idVoyageur;
	}


	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<Reservation> getReservation() {
		return reservation;
	}


	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}


	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", getIdVoyageur()=" + getIdVoyageur() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public void setFunction(Long idVoyageur) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
	
	
	
	

}
