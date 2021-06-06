package com.example.onetoonemapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetoonemapping.mapper.Adhaar;
import com.example.onetoonemapping.mapper.Person;
import com.example.onetoonemapping.mapper.PersonController;

@SpringBootApplication
public class OnetoonemappingApplication  implements CommandLineRunner {


	@Autowired
	PersonController controller;
	public static void main(String[] args) {
		SpringApplication.run(OnetoonemappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Adhaar a = new Adhaar();
		a.setId(1);
		Person p =new Person();
		p.setId(1);
		p.setName("anil");
		p.setPad(a);
	
		controller.saveData(p);
		
	}

}
