package com.xworkz.touristService;

import javax.naming.InvalidNameException;

public interface TouristService {
boolean nameValidation(String name) throws InvalidNameException;
}
