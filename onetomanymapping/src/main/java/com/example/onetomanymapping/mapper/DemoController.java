package com.example.onetomanymapping.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	CompanyRepo repo;
	@PostMapping("/save")
	public void save(Company c) {
	repo.save(c);
	
	}
}
