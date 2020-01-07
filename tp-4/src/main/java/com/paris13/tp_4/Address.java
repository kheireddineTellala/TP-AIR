package com.paris13.tp_4;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Address {
	
	@Id
	private int id;
	@Column
	private int rue;
	@Column
	private String streat;
	
	@OneToOne
	private PERSONNE persone;
	
	
	public PERSONNE getPersone() {
		return persone;
	}


	public void setPersone(PERSONNE persone) {
		this.persone = persone;
	}


	public void setStreat(String streat) {
		this.streat = streat;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRue() {
		return rue;
	}


	public void setRue(int rue) {
		this.rue = rue;
	}


	public String getStreat() {
		return streat;
	}

 
}
