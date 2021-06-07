package com.example.onetomanymapping.mapper;

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

	@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	//@JoinColumn(name="c_id")
	//if you have requirement that not to create seperate table
	//and to create foreign key in target table un comment above @Join
	//column annotation 
	//if you want to give specified name for generated table and columns in generated table use below syntax
//	 @JoinTable(name="EMPLOYEE_ACCOUNT", joinColumns={@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="ID")}
//	    , inverseJoinColumns={@JoinColumn(name="ACCOUNT_ID", referencedColumnName="ID")})
	


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
