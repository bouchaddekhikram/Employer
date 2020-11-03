package com.ikram.employers.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Entreprise {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idEnt;
private String nomEnt;
private String descriptionEnt;
@JsonIgnore
@OneToMany(mappedBy = "entreprise")
private List<Employer> employers;
public Long getIdEnt() {
	return idEnt;
}
public void setIdEnt(Long idEnt) {
	this.idEnt = idEnt;
}
public String getNomEnt() {
	return nomEnt;
}
public void setNomEnt(String nomEnt) {
	this.nomEnt = nomEnt;
}
public String getDescriptionEnt() {
	return descriptionEnt;
}
public void setDescriptionEnt(String descriptionEnt) {
	this.descriptionEnt = descriptionEnt;
}
public List<Employer> getEmployers() {
	return employers;
}
public void setEmployers(List<Employer> employers) {
	this.employers = employers;
}
}