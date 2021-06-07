package com.example.onetomanymapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetomanymapping.mapper.Company;
import com.example.onetomanymapping.mapper.DemoController;
import com.example.onetomanymapping.mapper.Employees;



@SpringBootApplication
public class OnetomanymappingApplication implements CommandLineRunner{
	@Autowired
	DemoController demo;
	public static void main(String[] args) {
		SpringApplication.run(OnetomanymappingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		List<Employees> list = new ArrayList<>();
		Employees emp = new Employees();
		emp.setName("anil");
		Employees emp1 = new Employees();
		emp1.setName("salam");
		list.add(emp1);
		list.add(emp);
		Company c = new Company();
		c.setEmp(list);
		c.setName("virtusa");
		
		demo.save(c);
	}

}
