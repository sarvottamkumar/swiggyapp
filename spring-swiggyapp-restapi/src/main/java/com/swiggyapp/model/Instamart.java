package com.swiggyapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Instamart {
	
//	@Id
//	@GeneratedValue(generator = "swy_id", strategy = GenerationType.AUTO)
//	@SequenceGenerator(name = "swy_id", sequenceName = "swiggy_id")
	
	@Id
	@GeneratedValue(generator="ins_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "ins_id",sequenceName = "insta_sequence",initialValue = 1,allocationSize = 1)
	private Integer instaId;
	
	private String category;
	
	private String item;
	
	private double price;

	public Instamart() {
		super();
	}

	public Instamart(String category, String item, double price) {
		super();
		this.category = category;
		this.item = item;
		this.price = price;
	}

	public Integer getInstaId() {
		return instaId;
	}

	public void setInstaId(Integer instaId) {
		this.instaId = instaId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Instamart [instaId=" + instaId + ", category=" + category + ", item=" + item + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	


}
