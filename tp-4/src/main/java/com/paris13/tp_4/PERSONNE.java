package com.paris13.tp_4;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONNE")

public class PERSONNE implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
@Column(name = "ID", unique = true)
private int id ;

@Column(name = "NOM", nullable = false )
private String fName ;

@Column(name = "PRENOM", nullable = false )
private String lName ;

@Column(name = "TEL", nullable = false )
private String tel ;

@Column(name = "MAIL", nullable = false )
private String mail ;

@OneToOne(cascade = {CascadeType.ALL})
private Address address ;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getID() {
	return id;
}
public void setID (int id) {
	this.id=id;
}

public String getfName() {
	return fName;
}
public void setfName (String  fName) {
	this.fName=fName;
}

public String getlName() {
	return lName ;
}

public void setlName (String  fName) {
	this.lName=fName;
}


public String gettel() {
	return tel ;
}

public void settel (String tel) {
	this.tel=tel;
}


public String getmail() {
	return mail ;
}

public void setmail (String mail) {
	this.mail=mail;
}

 

}



