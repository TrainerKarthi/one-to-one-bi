package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVehicleCharsey {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Vehicle vehicle = entityManager.find(Vehicle.class,2);
		
		if (vehicle != null) {
			 
			Charsey charsey = vehicle.getCharsey();
			System.out.println(charsey.getCharseyNumber());
			System.out.println(charsey.getType());
			
			System.out.println(vehicle.getName());
			System.out.println(vehicle.getCost());
			
		} else {
			System.out.println("no vehicle found");
		}
	}

}
