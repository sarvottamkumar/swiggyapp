package com.swiggyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggyapp.model.Swiggy;
import com.swiggyapp.repository.ISwiggyRepository;

@Service
public class SwiggyServiceImpl implements ISwiggyService{
	
	@Autowired
	ISwiggyRepository swiggyRepository;

	@Override
	public void addSwiggy(Swiggy swiggy) {
	
		swiggyRepository.save(swiggy);
	}

	@Override
	public void updateSwiggy(Swiggy swiggy) {
		swiggyRepository.save(swiggy);
		
	}

	@Override
	public void deleteSwiggy(int swiggyId) {
		
		swiggyRepository.deleteById(swiggyId);
	}

	@Override
	public Swiggy getById(int swiggyId) {
		return null;
	}

	@Override
	public List<Swiggy> getAll() {
		
		return swiggyRepository.findAll();
	}

	@Override
	public List<Swiggy> getByType(String type) {
	
		return swiggyRepository.findByType(type);
	}

	@Override
	public List<Swiggy> getByRatings(double ratings) {
		
		return swiggyRepository.findByRatings(ratings);
	}

	@Override
	public List<Swiggy> getByTypeAndRatings(String type, double ratings) {
		return swiggyRepository.findByTypeAndRatings(type, ratings);
	}

	@Override
	public List<Swiggy> getByPrice(double price) {
		return swiggyRepository.findByPrice(price);
	}

	@Override
	public List<Swiggy> getByName(String name) {
		return swiggyRepository.findByName(name);
	}

	@Override
	public List<Swiggy> getByItem(String item) {
		
		return swiggyRepository.findByItem(item);
	}

	@Override
	public List<Swiggy> getByCategoryAndItem(String category, String item) {
		
		return swiggyRepository.findByCategoryAndItem(category, item);
	}

	@Override
	public List<Swiggy> getByItemAndPrice(String item, double price) {
		return swiggyRepository.findByitemAndPrice(item, price);
	}

	

}
