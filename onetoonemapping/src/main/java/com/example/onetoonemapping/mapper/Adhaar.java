package com.example.onetoonemapping.mapper;

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

    
   
	public int getId() {
		return adhaarId;
	}

	public void setId(int adhaarId) {
		this.adhaarId = adhaarId;
	}

	


	@Override
	public String toString() {
		return "Adhaar [adhaarId=" + adhaarId + "]";
	}

}
