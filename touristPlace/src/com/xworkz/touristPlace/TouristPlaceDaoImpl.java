package com.xworkz.touristPlace;

import java.util.Arrays;

import javax.naming.InvalidNameException;

public class TouristPlaceDaoImpl implements TouristPlaceDAO {
	String[] name = new String[10];
	int index;

	@Override
	public boolean save(String name) {
		this.name[index] = name;
		System.out.println(index + " " + name);
		index++;
		return false;
	}

	@Override
	public boolean checkPlaceName(String name)throws InvalidNameException{
		for (String ref : this.name)  {
			
		
			if (ref.equals(name)) {
				throw new InvalidNameException ("placename is not null");
			}
			else {
				System.out.println("placeName is null ");
			}
			
		}
		return false;
	}

	@Override
	public String toString() {
		return "TouristPlaceDaoImpl [nam=" + Arrays.toString(name) + ", index=" + index + "]";
	}

}
