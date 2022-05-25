package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompanyGst {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company = entityManager.find(Company.class,1);
		Gst gst = company.getGst();
		System.out.println(company.getName());System.out.println(company.getPhone());
		System.out.println(company.getWeb());
		System.out.println("==================");
		
		System.out.println(gst.getGstNumber());
		System.out.println(gst.getCountry());
		System.out.println(gst.getState());
	}

}
