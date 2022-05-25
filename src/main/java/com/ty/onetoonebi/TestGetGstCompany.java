package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetGstCompany {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst = entityManager.find(Gst.class,1);
		Company company = gst.getCompany();
		
		System.out.println(company.getName());System.out.println(company.getPhone());
		System.out.println(company.getWeb());
		System.out.println("==================");
		
		System.out.println(gst.getGstNumber());
		System.out.println(gst.getCountry());
		System.out.println(gst.getState());
	}
}
