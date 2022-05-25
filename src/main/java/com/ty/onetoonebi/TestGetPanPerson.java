package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPanPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Pan pan = entityManager.find(Pan.class,3);
		
		Person person =pan.getPerson();
		System.out.println(person.getName());
		System.out.println(person.getEmail());
		System.out.println(person.getPhone());
		
		System.out.println("======================");
		
		System.out.println(pan.getAddress());
		System.out.println(pan.getPanNum());
	}

}
