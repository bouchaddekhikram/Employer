package com.ikram.employers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ikram.employers.entities.Employer;
import com.ikram.employers.service.EmployerService;

@SpringBootApplication
public class EmployersApplication implements CommandLineRunner {
@Autowired
EmployerService employerService;
public static void main(String[] args) {
SpringApplication.run(EmployersApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
	employerService.saveEmployer(new Employer("Sami", 2600.0, new Date()));
	employerService.saveEmployer(new Employer("Donia", 2800.0, new Date()));
	employerService.saveEmployer(new Employer("Rami", 900.0, new Date()));
}
}