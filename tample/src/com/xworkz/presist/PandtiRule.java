package com.xworkz.presist;

import com.xworkz.tample.TampleRule;

public class PandtiRule {
private TampleRule tampleRule;

public PandtiRule(TampleRule tampleRule) {
	this.tampleRule=tampleRule;
}



public void checkValidation() {
	 boolean res= tampleRule.food();
	 boolean  res1 = tampleRule.relegtions();
	 boolean res3 =tampleRule.shoes();
	
	if(res && res1 && res3) {
		System.out.println("eligible to come in tapmle");
	}
	else {
		System.out.println("not eligible to come in tapmle");
	}
}
}
