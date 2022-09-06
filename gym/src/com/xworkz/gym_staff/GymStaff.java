package com.xworkz.gym_staff;

import java.security.PublicKey;

import com.xwrokz.gym_rule.GymRule;

public class GymStaff {

	private GymRule gymRule; 
	
//	public GymStaff() {
//	System.out.println("this is default constructor");
//	}	
//	
	public void clean() {
		System.out.println("cleaning");
	}
	
  public  GymStaff(GymRule gymRule){
	  
	  this.gymRule=gymRule;
	
	  
	}
	
  public void checkedRule() {
	  System.out.println("rule is checked");
	  
	  boolean shoos= gymRule.wearShoes();
	  boolean uni=gymRule.uniSex();
	  double fee=gymRule.fees();
	  if(shoos && uni && fee>200) {
		  System.out.println("rules are follewd");
		  
		  
	  }
	  else {
		  System.out.println("rules are not fallowed");
	  }
  }
	
}
