package com.example.onetoonemapping.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdhaarRepo  extends JpaRepository<Adhaar,Integer>{

}
