package com.swiggyapp.service;

import java.util.List;

import com.swiggyapp.model.Swiggy;

public interface ISwiggyService {
	
	void addSwiggy(Swiggy swiggy);
	void updateSwiggy(Swiggy swiggy);
	void deleteSwiggy(int swiggyId);

	Swiggy getById(int swiggyId);
	
	List<Swiggy> getAll();
	List<Swiggy> getByType(String type); //swiggy
	List<Swiggy> getByRatings(double ratings); //restaurants
	List<Swiggy> getByTypeAndRatings(String type,double ratings); //rest
	List<Swiggy> getByPrice(double price); //inst
	List<Swiggy> getByName(String name);//res
	List<Swiggy> getByItem(String item); //instamart
	List<Swiggy> getByCategoryAndItem(String category,String item);
	List<Swiggy> getByItemAndPrice(String item,double price);

}
