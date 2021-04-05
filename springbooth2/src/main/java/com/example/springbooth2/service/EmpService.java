package com.example.springbooth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbooth2.model.Employee;
import com.example.springbooth2.repository.EmpRepo;

@Service

public class EmpService {

	@Autowired
	EmpRepo repo;
	public int save(Employee emp) {
	repo.save(emp);
		
		return emp.getId();
	}
}
