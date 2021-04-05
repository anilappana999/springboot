package com.example.springbooth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbooth2.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
