package com.xworkz.gym;

import com.xwrokz.gym_rule.GymRule;

public class PrajwalGymRule implements GymRule {

	@Override
	public boolean wearShoes() {
		System.out.println("wearing shoes");
		return true;
	}

	@Override
	public boolean uniSex() {
		System.out.println("only male can join");
		return true;
	}

	@Override

	public double fees() {
		System.out.println("fees paid");
		return 400D;
	}

}
