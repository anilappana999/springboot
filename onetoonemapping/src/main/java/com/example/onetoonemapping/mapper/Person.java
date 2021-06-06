package com.example.onetoonemapping.mapper;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	
	private int id;
	private String name;
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	private Adhaar pad;

	public Adhaar getPad() {
		return pad;
	}

	public void setPad(Adhaar pad) {
		this.pad = pad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
