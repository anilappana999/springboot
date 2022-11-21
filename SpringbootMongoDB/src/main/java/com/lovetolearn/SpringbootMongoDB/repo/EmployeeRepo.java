package com.lovetolearn.SpringbootMongoDB.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lovetolearn.SpringbootMongoDB.entity.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
