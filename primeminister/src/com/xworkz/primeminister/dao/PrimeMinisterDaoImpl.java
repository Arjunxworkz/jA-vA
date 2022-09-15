package com.xworkz.primeminister.dao;

public class PrimeMinisterDaoImpl implements PrimeMinisterDAO {

	String[] name = new String[5];
	int index;

	@Override
	public boolean save(String name) {
		this.name[index] = name;
		System.out.println(index + " " + name);
		index++;
		return false;
	}

	@Override
	public boolean ckeckname(String name) {
		
		return false;
	}


}
