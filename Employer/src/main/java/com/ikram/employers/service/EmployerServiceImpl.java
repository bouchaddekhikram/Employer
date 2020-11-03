package com.ikram.employers.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ikram.employers.entities.Employer;
import com.ikram.employers.entities.Entreprise;
import com.ikram.employers.repos.EmployerRepository;

@Service
public class EmployerServiceImpl implements EmployerService {
	
	@Autowired
	EmployerRepository employerRepository;
	@Override
	public Employer saveEmployer(Employer emp) {
	return employerRepository.save(emp);
	}
	@Override
	public Employer updateEmployer(Employer emp) {
	return employerRepository.save(emp);
	}
	@Override
	public void deleteEmployer(Employer emp) {
		employerRepository.delete(emp);
	}
	@Override
	public void deleteEmployerById(Long id) {
		 employerRepository.deleteById(id);
	}
	
	
	@Override
	public Employer getEmployer(Long id) {
	return employerRepository.findById(id).get();
	}
	@Override
	public List<Employer> getAllEmployers() {
	return employerRepository.findAll();
	}
	
	
	@Override
	public Page<Employer> getAllEmployersParPage(int page, int size) {
	return employerRepository.findAll(PageRequest.of(page, size));
	}
	
	
	
	@Override
	public List<Employer> findByNomEmployer(String nom) {
	return employerRepository.findByNomEmployer(nom);
	}
	@Override
	public List<Employer> findByNomEmployertContains(String nom) {
	return employerRepository.findByNomEmployerContains(nom);
	}
	@Override
	public List<Employer> findByNomSalaire(String nom, Double salaire) {
		
		return employerRepository.findByNomSalaire(nom, salaire);
	}
	@Override
	public List<Employer> findByEntreprise(Entreprise entreprise) {
	return employerRepository.findByEntreprise(entreprise);
	}
	@Override
	public List<Employer> findByEntrepriseIdEnt(Long id) {
	return employerRepository.findByEntrepriseIdEnt(id);
	}
	@Override
	public List<Employer> findByOrderByNomEmployerAsc() {
	return employerRepository.findByOrderByNomEmployerAsc();
	}
	@Override
	public List<Employer> trierEmployersNomsSalaire() {
	return employerRepository.trierEmployersNomsSalaire();
	}
	@Override
	public void deleteEmployertById(Long id) {
		employerRepository.deleteById(id);
		
	}
	
	
	}
	
	


