package com.xworkz.bridgeClass;

import com.xworkz.bridgeIfc.HrRules;
import com.xworkz.bridgeIfc.ManagerRule;
import com.xworkz.bridgeIfc.SecurityRule;

public class ItRuleRunner {

	public static void main(String[] args) {
		ItRuleFollower it=new ItRuleFollower();
		
		it.harrasment();
		it.informLeave();
		it.parkingApproval();
		it.swipeCard();
		it.applyLeave();
		
		System.out.println("=============================");
		
		HrRules hr=(HrRules)it;
		hr.applyLeave();
		hr.harrasment();

		System.out.println("=============================");
		
		SecurityRule sr=(SecurityRule)it;
		sr.applyLeave();
		sr.harrasment();
		sr.informLeave();
		sr.parkingApproval();
		sr.swipeCard();
		
		System.out.println("=============================");
		
		ManagerRule mr=(ManagerRule)it;
		it.applyLeave();
		it.harrasment();
		
		System.out.println("=============================");
	
	

	}

}
