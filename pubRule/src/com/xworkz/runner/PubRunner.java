package com.xworkz.runner;

import com.xworkz.pub.DownTownPub;
import com.xworkz.pubRule.dao.PubRule;
import com.xworkz.pubRuleImpl.CustomerPubRule;

public class PubRunner {

	public static void main(String[] args) {
		PubRule pubRule=new CustomerPubRule();
		
		DownTownPub downTownPub=new DownTownPub(pubRule);
		downTownPub.checkRule();

	}

}
