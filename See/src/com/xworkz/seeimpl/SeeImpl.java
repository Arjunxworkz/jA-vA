package com.xworkz.seeimpl;

import java.util.Iterator;

import com.xworkz.see.SeeDAO;

public class SeeImpl implements SeeDAO {
	String seeName[] = new String[10];
	

	@Override
	public void save(String name) {

		for (int i = 0; i < seeName.length; i++) {
			if (seeName[i] == null) {
                seeName[i]=name;
              System.out.println("name"+name);
			}	
			else {
			    System.out.println("not value");
			}
		}
	}

	@Override
	public void printAll() {
		for (int i = 0; i < seeName.length; i++) {
			System.out.println(seeName[i]);
		}
		
	}

}
