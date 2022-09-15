package com.xworkz.touristPlace;

import javax.naming.InvalidNameException;

public interface TouristPlaceDAO {
boolean save(String name);
boolean checkPlaceName(String name) throws InvalidNameException;
}
