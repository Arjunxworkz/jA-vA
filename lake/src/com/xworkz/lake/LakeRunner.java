package com.xworkz.lake;

import com.xworkz.lake.dao.LakeDAOImpl;

public class LakeRunner {

	public static void main(String[] args) {
		LakeDAOImpl lakeDAOImpl = new LakeDAOImpl();
		lakeDAOImpl.save("Btm");
		lakeDAOImpl.save("banglore");
		lakeDAOImpl.save("karnatka");
		lakeDAOImpl.save("up");
		lakeDAOImpl.save("kanpur");
		lakeDAOImpl.save("nagpur");
		lakeDAOImpl.save("andra");
		lakeDAOImpl.save("mumbai");
		lakeDAOImpl.save("delhi");
		lakeDAOImpl.save("gujrat");
		lakeDAOImpl.printAllLakes();
		System.out.println("===============================");

		lakeDAOImpl.updateByIndex("amar", 2);
		lakeDAOImpl.printAllLakes();
		System.out.println("===============================");

		lakeDAOImpl.updateByName("gujrat", "0");
		lakeDAOImpl.printAllLakes();

		System.out.println("===============================");
		lakeDAOImpl.deleteByName("Btm");
		lakeDAOImpl.printAllLakes();

		System.out.println("===============================");
	    lakeDAOImpl.deleteByIndex(2);
	    lakeDAOImpl.printAllLakes();
	}

}
