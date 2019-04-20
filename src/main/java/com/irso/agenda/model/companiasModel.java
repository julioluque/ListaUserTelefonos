package com.irso.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class companiasModel {

	@Id
	@GeneratedValue
	Long id;
	String conpania;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConpania() {
		return conpania;
	}
	public void setConpania(String conpania) {
		this.conpania = conpania;
	}
	
	
}
