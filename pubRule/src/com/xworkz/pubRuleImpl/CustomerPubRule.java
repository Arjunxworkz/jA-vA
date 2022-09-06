package com.xworkz.pubRuleImpl;

import com.xworkz.pubRule.dao.PubRule;

public class CustomerPubRule implements PubRule {

	@Override
	public boolean dressCodeFollowed() {
		System.out.println("dress is match");
		return true;
	}

	@Override
	public int age() {
		System.out.println("person is eligble");
		return 25;
	}

	@Override
	public boolean validProof() {
		System.out.println("validProof is verify");
		return true;
	}

}
