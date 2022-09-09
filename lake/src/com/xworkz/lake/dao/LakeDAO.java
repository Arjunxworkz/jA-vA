package com.xworkz.lake.dao;

public interface LakeDAO {
	boolean save(String lakeName);
	void printAllLakes();
	boolean updateByIndex(String newlake, int index);
	boolean deleteByIndex(int index);
	boolean updateByName(String name ,String newName);
	boolean deleteByName(String Name);

}
