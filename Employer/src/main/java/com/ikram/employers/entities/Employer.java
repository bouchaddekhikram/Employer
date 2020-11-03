package com.ikram.employers.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idEmployer;
private String nomEmployer;
private Double salaire;
private Date dateDebut;
@ManyToOne
private Entreprise entreprise;


public Employer() {
super();
}
public Employer(String nomEmployer, Double salaire, Date dateDebut) {
super();
this.nomEmployer = nomEmployer;
this.salaire = salaire;
this.dateDebut = dateDebut;
}
public Long getIdEmployer() {
return idEmployer;
}
public String getNomEmployer() {
	return nomEmployer;
}
public void setNomEmployer(String nomEmployer) {
	this.nomEmployer = nomEmployer;
}
public Double getSalaire() {
	return salaire;
}
public void setSalaire(Double salaire) {
	this.salaire = salaire;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public void setIdEmployer(Long idEmployer) {
	this.idEmployer = idEmployer;
}
@Override
public String toString() {
	return "Employer [idEmployer=" + idEmployer + ", nomEmployer=" + nomEmployer + ", salaire=" + salaire
			+ ", dateDebut=" + dateDebut + "]";
}

}