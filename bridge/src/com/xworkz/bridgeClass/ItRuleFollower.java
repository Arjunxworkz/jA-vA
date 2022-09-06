package com.xworkz.bridgeClass;

import com.xworkz.bridgeIfc.SecurityRule;

public class ItRuleFollower implements SecurityRule{
	String name;
public	boolean ruleMakeBy() {
		return false;
		
	}

	@Override
	public boolean informLeave() {
		System.out.println("plz inform for leave");
		return false;
	}

	@Override
	public boolean workFromHome() {
		System.out.println("work from home");
		return false;
	}

	@Override
	public boolean applyLeave() {
		System.out.println("plz apply before 15 days");
		return false;
	}

	@Override
	public boolean harrasment() {
		System.out.println("Harresment is not good");
		return false;
	}

	@Override
	public boolean swipeCard() {
		System.out.println("swipecard is succes");
		return false;
	}

	@Override
	public boolean parkingApproval() {
		System.out.println("parking is approval");
		return false;
	}

}
