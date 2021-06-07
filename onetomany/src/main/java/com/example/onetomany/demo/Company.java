package com.example.onetomany.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Company {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;

	@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
	
	private List<Employees> emp;
	

	


	public List<Employees> getEmp() {
		return emp;
	}

	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}
	
}
