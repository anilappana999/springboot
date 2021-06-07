package com.example.manytomany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Autowired
	ProjectRepo repo;

	@PostMapping("/save")
	public void save(Project p) {
		repo.save(p);
	}
}
