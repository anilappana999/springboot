package com.lovetolearn.SpringbootMongoDB.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Employee {

	private String id;
	private String name;
	private String city;
}
