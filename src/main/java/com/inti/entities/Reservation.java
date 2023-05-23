package com.inti.entities;

import java.util.Date;

public class Reservation {
	private Long idReservationn;
	private Date dateReservationn;
	private int nbJourss;

	public Reservation() {
		super();
	}

	public Reservation(Date dateReservationn, int nbJourss) {
		super();
		this.dateReservationn = dateReservationn;
		this.nbJourss = nbJourss;
	}

	public Long getIdReservationn() {
		return idReservationn;
	}

	public void setIdReservationn(Long idReservationn) {
		this.idReservationn = idReservationn;
	}

	public Date getDateReservationn() {
		return dateReservationn;
	}

	public void setDateReservationn(Date dateReservationn) {
		this.dateReservationn = dateReservationn;
	}

	public int getNbJourss() {
		return nbJourss;
	}

	public void setNbJourss(int nbJourss) {
		this.nbJourss = nbJourss;
	}

	@Override
	public String toString() {
		return "Reservation [idReservationn=" + idReservationn + ", dateReservationn=" + dateReservationn
				+ ", nbJourss=" + nbJourss + "]";
	}
	
	

}
