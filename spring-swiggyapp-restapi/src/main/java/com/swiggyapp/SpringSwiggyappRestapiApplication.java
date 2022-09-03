package com.swiggyapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.swiggyapp.model.Instamart;
import com.swiggyapp.model.Restaurants;
import com.swiggyapp.model.Swiggy;
import com.swiggyapp.service.ISwiggyService;

@SpringBootApplication
public class SpringSwiggyappRestapiApplication implements CommandLineRunner{

	@Autowired
	ISwiggyService swiggyService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSwiggyappRestapiApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Instamart instamart = new Instamart("Glossary", "Tomato", 50);
		
		Restaurants restaurant1 = new Restaurants("Udapi", "friedrice",120, 4.5);
//		Restaurants restaurant2 = new Restaurants("Taj", "chickenfriedrice",150, 4.0);
		Set<Restaurants> restaurants = new HashSet<>(Arrays.asList(restaurant1));
		
		Swiggy swiggy = new Swiggy("mathikere",560054,"nonveg", instamart, restaurants);
		
		swiggyService.addSwiggy(swiggy);
		
	}

}
