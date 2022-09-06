package com.xworkz.bridgeIfc;

public interface SecurityRule extends ManagerRule, HrRules{

	boolean swipeCard();
	
	boolean parkingApproval();
}
