package com.ikram.employers.service;


import java.util.List;

import org.springframework.data.domain.Page;

import com.ikram.employers.entities.Employer;
import com.ikram.employers.entities.Entreprise;

public interface EmployerService {

	
	Employer saveEmployer(Employer emp);
	Employer updateEmployer(Employer emp);
	void deleteEmployer(Employer emp);
	void deleteEmployertById(Long id);
	Employer getEmployer(Long id);
	List<Employer> getAllEmployers();
	List<Employer> findByNomEmployer(String nom);
	List<Employer> findByNomEmployertContains(String nom);
	List<Employer> findByNomSalaire (String nom, Double salaire);
	List<Employer> findByEntreprise (Entreprise entreprise);
	List<Employer> findByEntrepriseIdEnt(Long id);
	List<Employer> findByOrderByNomEmployerAsc();
	List<Employer> trierEmployersNomsSalaire();
	void deleteEmployerById(Long id);
	Page<Employer> getAllEmployersParPage(int i, int j);
}
