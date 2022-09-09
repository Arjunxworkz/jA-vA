package com.xworkz.presist;

import com.xworkz.tample.TampleRule;

public class PandtiRule {
private TampleRule tampleRule;
private int tamp;

public PandtiRule(TampleRule tampleRule ,int tamp) {
	this.tampleRule=tampleRule;
	this.tamp=tamp;
	
	System.out.println(tampleRule.getClass().getSimpleName());
}



public void checkValidation() {
	 boolean res= tampleRule.food();
	 boolean  res1 = tampleRule.relegtions();
	 boolean res3 =tampleRule.shoes();
	
	if(res && res1 && res3) {
		System.out.println("eligible to come in tapmle" +tamp);
	}
	else {
		System.out.println("not eligible to come in tapmle");
	}
}



@Override
public String toString() {
	return "PandtiRule [tampleRule=" + tampleRule + ", tamp=" + tamp + "]";
}
}



