package com.xworkz.lake.dao;

import java.util.Iterator;

public class LakeDAOImpl implements LakeDAO {
	private String[] lakeNames = new String[10];

	@Override
	public boolean save(String lakeName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == null) {
				lakeNames[i] = lakeName;
				return true;
			}

		}
		return true;
	}

	@Override
	public void printAllLakes() {
		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}

	}

	@Override
	public boolean updateByIndex(String newlake, int index) {
		lakeNames[index] = newlake;

		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
	   lakeNames[index]=null;
		return false;
	}

	@Override
	public boolean updateByName(String name, String newName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == name) {
				lakeNames[i] = newName;
			}

		}
		return false;
	}

	@Override
	public boolean deleteByName(String Name) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == Name) {
				lakeNames[i] = null;
			}

		}
		return false;
	}

}
