package com.xworkz.darshan;

import com.xworkz.tample.TampleRule;

public class DarshanRule  implements TampleRule {

	

	@Override
	public boolean relegtions() {
	System.out.println("Relegtions hindu");
	return true;
	
		
	}
	@Override
	public boolean shoes() {
	    System.out.println("shoes is not wear");
		return true;
	}

	@Override
	public boolean food() {
	System.out.println("only veg food");
		return false;
	}
	
	


}
