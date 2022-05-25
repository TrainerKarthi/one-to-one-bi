package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVehicleCharseyById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = entityManager.find(Vehicle.class,1);
		
		if (vehicle != null) {
			entityTransaction.begin();
			entityManager.remove(vehicle);
			entityTransaction.commit();
		}
		else {
			System.out.println("no data to delete");
		}
	}

}
