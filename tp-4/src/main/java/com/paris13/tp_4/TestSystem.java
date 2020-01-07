package com.paris13.tp_4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSystem {
	
	
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    addCustomer( 1 , "kheireddine", "tellala", "0755801144", "kheiro@gmail.com", "le raincy");
		
		ENTITY_MANAGER_FACTORY.close();
	}

	public static void addCustomer(int id , String fName , String lName, String tel, String mail , String idAdr , ) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		try {
			et = em.getTransaction();
			et.begin();
			
			PERSONNE  personne = new PERSONNE();
			Address address = new Address();
			
			address.setRue(7);
			address.setStreat("Pierre Currie");
			address.setId(1);			
			
			personne.setID(id);
			personne.setfName(fName);
			personne.setlName(lName);
			personne.setmail(mail);
			personne.setAddress(address);
			personne.settel(tel);
			em.persist(personne);
			et.commit();
		}
		
	catch(Exception ex) {
		if (et != null) {
			et.rollback();
		}
		ex.printStackTrace();
	}
		finally {
			em.close();
		}
	}
	
	
	
}
