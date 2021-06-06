package com.example.onetoone.demo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adhaar {
	@Id

	private int adhaarId;

    
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn
	private Person person;
	public int getId() {
		return adhaarId;
	}

	public void setId(int adhaarId) {
		this.adhaarId = adhaarId;
	}

	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Adhaar [adhaarId=" + adhaarId + "]";
	}

}
