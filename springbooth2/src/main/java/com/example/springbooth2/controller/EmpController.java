package com.example.springbooth2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbooth2.model.Employee;
import com.example.springbooth2.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService ser;

	@PostMapping("saveUpdate")
	public int saveData(Employee emp) {

		return ser.save(emp);
	}

}
