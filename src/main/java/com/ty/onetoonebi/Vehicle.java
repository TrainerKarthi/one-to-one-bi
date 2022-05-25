package com.ty.onetoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long cost;

//	@OneToOne(cascade = CascadeType.PERSIST) // here if we just persist the vehicle i.e. entityManager.persist(vehicle)
	// no need to persist the child table i.e.charsey table

//	@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})//if we want multiple cascades we use the arrays

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // if we want all cascades we use ALL
	// one to one mapping is eager type if we done it as a lazy then instead of
	// creating one query it will be done by two or more queries
	@JoinColumn
	private Charsey charsey;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public Charsey getCharsey() {
		return charsey;
	}

	public void setCharsey(Charsey charsey) {
		this.charsey = charsey;
	}

}
