package com.swiggyapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Swiggy {
	
	@Id
	@GeneratedValue(generator = "swigy_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "swigy_id", sequenceName = "swiggy_sequence",initialValue = 1,allocationSize = 1)
	private Integer swiggyId;
	
	private String Address;
	
	private int pincode;
	
	private String type;
	
	@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="swiggy_id")
	private Instamart instamart;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="rest_id")
	private Set<Restaurants> restaurantList;

	public Swiggy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Swiggy(String address, int pincode, String type, Instamart instamart, Set<Restaurants> restaurantList) {
		super();
		Address = address;
		this.pincode = pincode;
		this.type = type;
		this.instamart = instamart;
		this.restaurantList = restaurantList;
	}

	public Integer getSwiggyId() {
		return swiggyId;
	}

	public void setSwiggyId(Integer swiggyId) {
		this.swiggyId = swiggyId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Instamart getInstamart() {
		return instamart;
	}

	public void setInstamart(Instamart instamart) {
		this.instamart = instamart;
	}

	public Set<Restaurants> getRestaurantList() {
		return restaurantList;
	}

	public void setRestaurantList(Set<Restaurants> restaurantList) {
		this.restaurantList = restaurantList;
	}

	@Override
	public String toString() {
		return "Swiggy [swiggyId=" + swiggyId + ", Address=" + Address + ", pincode=" + pincode + ", type=" + type
				+ ", instamart=" + instamart + ", restaurantList=" + restaurantList + "]";
	}
	
	
	

}
