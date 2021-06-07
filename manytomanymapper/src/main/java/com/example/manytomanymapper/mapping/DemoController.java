package com.example.manytomanymapper.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Autowired
	EmployeeRepo repo;

	@PostMapping("/save")
	public void save(Employee e) {
		repo.save(e);
	}
}
