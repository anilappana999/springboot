package com.example.onetomanymapping.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EmployeesRepo extends JpaRepository<Employees,Long> {

}
