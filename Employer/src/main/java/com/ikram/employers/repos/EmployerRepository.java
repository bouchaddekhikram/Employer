package com.ikram.employers.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ikram.employers.entities.Employer;
import com.ikram.employers.entities.Entreprise;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
	List<Employer> findByNomEmployer(String nom);
	List<Employer> findByNomEmployerContains(String nom);
	@Query("select emp from Employer emp where emp.nomEmployer like %:nom and emp.salaire > :salaire")
	List<Employer> findByNomSalaire (@Param("nom") String nom,@Param("salaire") Double salaire);
	
	@Query("select emp from Employer emp where emp.entreprise = ?1")
	List<Employer> findByEntreprise (Entreprise entreprise);
	
	List<Employer> findByEntrepriseIdEnt(Long id);
	
	
	List<Employer> findByOrderByNomEmployerAsc();
	
	@Query("select emp from Employer emp order by emp.nomEmployer ASC, emp.salaire DESC")
	List<Employer> trierEmployersNomsSalaire ();
}