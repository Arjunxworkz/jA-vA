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

}
