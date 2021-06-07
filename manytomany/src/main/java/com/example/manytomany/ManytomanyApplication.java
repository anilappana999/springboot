package com.example.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.manytomany.demo.DemoController;
import com.example.manytomany.demo.Employee;
import com.example.manytomany.demo.Project;

@SpringBootApplication
public class ManytomanyApplication implements CommandLineRunner {

	@Autowired
	DemoController control;
	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
	
	
		Employee e = new Employee();
		e.setName("anil");
		
		Employee e1 = new Employee();
		e1.setName("appana");
		Set<Employee> list  = new HashSet<>();
		list.add(e);
		list.add(e1);
		Project pr = new Project();
		pr.setName("jpmorgan");
		pr.setList(list);
	
		control.save(pr);
		Project project = new Project();
		project.setList(list);
project.setName("virtusa");
control.save(project);
	
		
	}

}
