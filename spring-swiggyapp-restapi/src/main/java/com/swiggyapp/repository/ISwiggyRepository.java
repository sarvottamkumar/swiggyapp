package com.swiggyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiggyapp.model.Swiggy;

@Repository
public interface ISwiggyRepository extends JpaRepository<Swiggy, Integer>{

	List<Swiggy> findAll();
	List<Swiggy> findByType(String type);  //
	List<Swiggy> findByRatings(double ratings); //restaurants
	List<Swiggy> findByTypeAndRatings(String type,double ratings); //restaurants
	List<Swiggy> findByPrice(double price); //instamart
	List<Swiggy> findByName(String name); //res
	List<Swiggy> findByItem(String item); //instamart
	List<Swiggy> findByCategoryAndItem(String category,String item); //insta
	List<Swiggy> findByitemAndPrice(String item,double price); //insta
	
	
	
	
}
