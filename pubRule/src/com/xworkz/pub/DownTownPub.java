package com.xworkz.pub;

import com.xworkz.pubRule.dao.PubRule;

public class DownTownPub {
	private PubRule pubRule;

	public DownTownPub(PubRule pubRule) {
		this.pubRule = pubRule;

	}

 public	boolean checkRule() {
		boolean res1 = pubRule.dressCodeFollowed();
		int res2 = pubRule.age();
		boolean res3 = pubRule.validProof();
		
		if(res1==true && res2>21 && res3==true) {
			System.out.println("you can enter");
		}
		else {
			
			System.out.println("you can't enter");
		}
		return true;

	}
}
