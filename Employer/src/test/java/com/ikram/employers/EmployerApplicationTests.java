package com.ikram.employers;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.ikram.employers.entities.Employer;
import com.ikram.employers.entities.Entreprise;
import com.ikram.employers.repos.EmployerRepository;
import com.ikram.employers.service.EmployerService;

@SpringBootTest
class EmployersApplicationTests {

	
@Autowired
	private EmployerRepository employerRepository;
@Autowired
	private EmployerService employerService;

@Test
public void testCreateEmployer() {
	Employer emp = new Employer("Ali",200.500,new Date());
	employerRepository.save(emp);
}	
	
	
	
@Test
public void testFindEmployer()
{
Employer e = employerRepository.findById(13l).get();
System.out.println(e);
}
	
@Test
public void testUpdateEmployer()
{
Employer e = employerRepository.findById(13l).get();
e.setSalaire(100.0);
employerRepository.save(e);
}	

@Test
public void testDeleteEmployer()
{
employerRepository.deleteById(15L);
}

@Test
public void testListerTousEmployers()
	{
List<Employer> emps = employerRepository.findAll();
for (Employer e : emps)
{
System.out.println(e);
}
}


@Test
public void testFindByNomEmployerContains1()
{
Page<Employer> emps = employerService.getAllEmployersParPage(0,2);
System.out.println(emps.getSize());
System.out.println(emps.getTotalElements());
System.out.println(emps.getTotalPages());
emps.getContent().forEach(p -> {System.out.println(p.toString());
 });
/*ou bien
for (Employer emp : emps)
{
System.out.println(emp);
} */
}


@Test
public void testFindByNomEmployer()
{
List<Employer> emps = employerRepository.findByNomEmployer("Rami");

for (Employer emp : emps)
{
System.out.println(emp);
}

}
@Test
public void testFindByNomEmployerContains ()
{
List<Employer> emps=employerRepository.findByNomEmployerContains("Rami");

for (Employer emp : emps)
{
System.out.println(emp);
} }




@Test
public void testfindByNomSalaire()
{
List<Employer> emps = employerRepository.findByNomSalaire("Ali", 150.0);
for (Employer emp : emps)
{
System.out.println(emp);
}

}

@Test
public void testfindByEntreprise()
{
	Entreprise ent = new Entreprise();
ent.setIdEnt(20L);
List<Employer> emps = employerRepository.findByEntreprise(ent);
for (Employer emp : emps)
{
System.out.println(emp);
}

}

@Test
public void findByEntrepriseIdEnt()
{
List<Employer> emps = employerRepository.findByEntrepriseIdEnt(20L);
for (Employer emp : emps)
{
System.out.println(emp);
}

}

@Test
public void testfindByOrderByNomEmployerAsc()
{
List<Employer> emps =

employerRepository.findByOrderByNomEmployerAsc();
for (Employer emp : emps)
{
System.out.println(emp);
}

}

@Test
public void testTrierEmployersNomsSalaire()
{
List<Employer> emps = employerRepository.trierEmployersNomsSalaire();
for (Employer emp : emps)
{
System.out.println(emp);
}

}

}
