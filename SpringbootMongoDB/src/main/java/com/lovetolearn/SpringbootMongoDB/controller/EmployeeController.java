package com.lovetolearn.SpringbootMongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lovetolearn.SpringbootMongoDB.entity.Employee;
import com.lovetolearn.SpringbootMongoDB.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;
	

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeRepo.save(employee);
	}
	
	@GetMapping("/findData")
	public List<Employee> getData(){
		
		return employeeRepo.findAll();
	}
	
	@DeleteMapping("delete/{id}")
	public  void deleteById(@PathVariable String id) {
		
		employeeRepo.deleteById(id);
		
	}
	
}
