package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.onetoone.mapping.Adhaar;
import com.example.onetoone.mapping.Person;
import com.example.onetoone.mapping.PersonController;

@SpringBootApplication
public class OnetooneApplication  implements CommandLineRunner{

	@Autowired
	PersonController controller;
	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Adhaar a = new Adhaar();
		a.setId(1);
		Person p =new Person();
		p.setId(1);
		p.setName("anil");
		p.setPad(a);
		a.setPerson(p);
		controller.saveData(p);
	
	}

}
