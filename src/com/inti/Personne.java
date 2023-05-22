package com.inti;

public class Personne {
	private Long idPersonne;
	private Long nomPersonne;
	private int age;
	public Personne() {
		super();
	}
	public Personne(Long idPersonne, Long nomPersonne, int age) {
		super();
		this.idPersonne = idPersonne;
		this.nomPersonne = nomPersonne;
		this.age = age;
	}
	public Long getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(Long nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nomPersonne=" + nomPersonne + ", age=" + age + "]";
	}
	
	
	

}
