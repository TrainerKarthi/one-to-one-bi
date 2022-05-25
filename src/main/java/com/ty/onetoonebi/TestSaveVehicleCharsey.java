package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleCharsey {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.setName("S-cross");
		vehicle.setCost(77889);

		Charsey charsey = new Charsey();
		charsey.setType("kjdkfjei");
		charsey.setCharseyNumber("jdk7890989");
		
		vehicle.setCharsey(charsey);
		entityTransaction.begin();
		entityManager.persist(vehicle);//because of cascade in vehicle no need to persist the charsey mostly we 
		
//		entityManager.persist(charsey);//because of cascade in charsey no need to persist the vehicle
		entityTransaction.commit();
	}

}
