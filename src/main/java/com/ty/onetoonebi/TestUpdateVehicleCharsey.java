package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateVehicleCharsey {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = entityManager.find(Vehicle.class, 2);
		if (vehicle != null) {

			Charsey charsey = vehicle.getCharsey();
			entityTransaction.begin();
			
			vehicle.setName("ujki");
			charsey.setCharseyNumber("ksdjfi9878889");
			
			entityManager.merge(vehicle);
			
			entityTransaction.commit();

		} else {
			System.out.println("no vehicle");
		}

	}

}
