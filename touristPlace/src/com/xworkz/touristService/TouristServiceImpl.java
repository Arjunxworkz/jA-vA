package com.xworkz.touristService;

import javax.naming.InvalidNameException;

import com.xworkz.touristPlace.TouristPlaceDAO;

public class TouristServiceImpl implements TouristService  {
	TouristPlaceDAO dao;

	public TouristServiceImpl(TouristPlaceDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean nameValidation(String name) throws InvalidNameException {
		
		if (name != null && name.length() > 2 && name.length() < 10) {
			
			System.out.println("name is not null");
			this.dao.save(name);
			this.dao.checkPlaceName(name);
		}
		else {
			System.err.println("name is  null");
		}
			
		
		return true;
	}

}
