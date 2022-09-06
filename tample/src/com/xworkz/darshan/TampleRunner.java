package com.xworkz.darshan;

import com.xworkz.presist.PandtiRule;
import com.xworkz.tample.TampleRule;

public class TampleRunner {

	public static void main(String[] args) {
		TampleRule tampleRule=new DarshanRule();
		PandtiRule pandtiRule=new PandtiRule(tampleRule);
		pandtiRule.checkValidation();

	}

}
