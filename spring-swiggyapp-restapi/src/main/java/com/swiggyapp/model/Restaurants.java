package com.swiggyapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Restaurants {
	
	@Id
	@GeneratedValue(generator = "restaurants_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "restaurants_id", sequenceName = "restaurants_sequence",initialValue = 1,allocationSize = 1)
	private Integer restId;
	
	private String name;
	
	private String type; //item
	
	private double price;
	
	private double ratings;

	

	public Restaurants() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Restaurants(String name, String type, double price, double ratings) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.ratings = ratings;
	}

	public Integer getRestId() {
		return restId;
	}

	public void setRestId(Integer restId) {
		this.restId = restId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Restaurants [restId=" + restId + ", name=" + name + ", type=" + type + ", price=" + price + ", ratings="
				+ ratings + "]";
	}
	
}
