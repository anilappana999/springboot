package com.example.onetoonemapping.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	AdhaarRepo repo;

	@Autowired
	PersonRepo repo1;
	
	
	@PostMapping("savePerson")
	public  String saveData(Person person) {
		
		repo1.save(person);
		return "person-saved";
		
		
	}
	@PostMapping("saveAdhaar")
public  String saveAdhaarData( Adhaar p) {
		
		repo.save(p);
		return "AdhaarData-saved";
		
		
	}
}
